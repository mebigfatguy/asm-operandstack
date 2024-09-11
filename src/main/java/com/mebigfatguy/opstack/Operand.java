package com.mebigfatguy.opstack;

public class Operand {

	private record Value(boolean known, Object value) {
		static Value UNKNOWN = new Value(false, null);
	}

	private record Register(boolean known, int register) {
		static Register UNKNOWN = new Register(false, -1);
	}

	private Value value;
	private String type;
	private Register register;
	private String owner;
	private String name;

	private Operand() {
	}

	public static Builder builder() {
		return new Builder();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("{\n");
		sb.append("value: " + value + "\n");
		sb.append("type: " + type + "\n");
		sb.append("register: " + register + "\n");
		sb.append("owner: " + owner + "\n");
		sb.append("name: " + name + "\n");
		sb.append("}");
		return sb.toString();
	}

	static class Builder {
		private Value value = Value.UNKNOWN;
		private String type;
		private Register register = Register.UNKNOWN;
		private String owner;
		private String name;

		public Operand build() {
			Operand o = new Operand();
			o.value = value;
			o.type = type;
			o.register = register;
			o.owner = owner;
			o.name = name;
			return o;
		}

		public Builder withValue(Object object) {
			value = new Value(true, object);
			return this;
		}

		public Builder withType(String t) {
			type = t;
			return this;
		}

		public Builder withRegister(int varIndex) {
			register = new Register(true, varIndex);
			return this;
		}

		public Builder withOwner(String owningClass) {
			owner = owningClass;
			return this;
		}

		public Builder withName(String fieldName) {
			name = fieldName;
			return this;
		}
	}
}
