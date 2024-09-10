package com.mebigfatguy.opstack;

public class Operand {

	private Object value;
	private String type;
	private int fromRegister;

	public static Builder builder() {
		return new Builder();
	}

	static class Builder {
		private Object value;
		private String type;
		private int fromRegister = -1;

		public Operand build() {
			Operand o = new Operand();
			o.value = value;
			o.type = type;
			o.fromRegister = fromRegister;
			return o;
		}

		public Builder withValue(Object object) {
			value = object;
			return this;
		}

		public Builder withType(String t) {
			type = t;
			return this;
		}

		public Builder fromRegister(int varIndex) {
			fromRegister = varIndex;
			return this;
		}
	}
}
