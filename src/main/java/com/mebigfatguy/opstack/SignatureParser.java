package com.mebigfatguy.opstack;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class SignatureParser {

	private static Pattern SIG_PATTERN = Pattern.compile("(\\[*(:?(:?L[^;]*;)|I|J|F|D|B|C|S|V))");

	private SignatureParser() {
	}

	public static MethodSignature parseMethodSignature(String signature) {

		if (signature.length() < 3) {
			throw new SignatureParsingException(signature, 0);
		}

		if (signature.charAt(0) != '(') {
			throw new SignatureParsingException(signature, 0);
		}

		Matcher m = SIG_PATTERN.matcher(signature);

		List<String> parms = new ArrayList<>(8);
		int lastEnd;
		if (signature.charAt(1) != ')') {
			if (!m.find(1)) {
				throw new SignatureParsingException(signature, 1);
			}

			if (m.start() != 1) {
				throw new SignatureParsingException(signature, 1);
			}

			parms.add(m.group(1));

			lastEnd = m.end();
			while (signature.charAt(lastEnd) != ')') {
				if (!m.find()) {
					throw new SignatureParsingException(signature, lastEnd);
				}

				parms.add(m.group(1));
				lastEnd = m.end();
			}
		} else {
			lastEnd = 1;
		}

		if (!m.find(lastEnd + 1)) {
			throw new SignatureParsingException(signature, lastEnd + 1);
		}

		return new MethodSignature(m.group(1), parms);
	}

	public static class MethodSignature {
		private String returnType;
		private List<String> methodParameters;

		public MethodSignature(String returnType, List<String> methodParameters) {
			this.returnType = returnType;
			this.methodParameters = methodParameters;
		}

		public String getReturnType() {
			return returnType;
		}

		public List<String> getMethodParameters() {
			return methodParameters;
		}

		@Override
		public int hashCode() {
			return Objects.hash(methodParameters, returnType);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj) {
				return true;
			}
			if (obj == null) {
				return false;
			}
			if (getClass() != obj.getClass()) {
				return false;
			}
			MethodSignature other = (MethodSignature) obj;
			return Objects.equals(methodParameters, other.methodParameters)
					&& Objects.equals(returnType, other.returnType);
		}
	}

	public static class SignatureParsingException extends RuntimeException {

		int position;

		public SignatureParsingException(String signature, int p) {
			super(signature);
			position = p;
		}

		public int getPosition() {
			return position;
		}
	}
}
