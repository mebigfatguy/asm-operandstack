package com.mebigfatguy.opstack;

public class Operand {

	private Object value;
	private String type;

	public static Builder builder() {
		return new Builder();
	}

	static class Builder {
		private Object value;
		private String type;

		public Operand build() {
			Operand o = new Operand();
			o.value = value;
			o.type = type;
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
	}
}
