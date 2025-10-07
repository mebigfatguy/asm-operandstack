package com.mebigfatguy.opstack;

import java.util.ArrayList;
import java.util.List;

public class OpStack {

	private List<Operand> stack = new ArrayList<>();

	public void push(Operand o) {
		stack.add(o);
	}

	public Operand pop() {
		return stack.remove(stack.size() - 1);
	}

	public void pop2() {
		int len = stack.size();
		stack.remove(--len);
		stack.remove(--len);
	}

	public void dup2x2() {
		int len = stack.size();
		Operand top = stack.get(len - 1);
		stack.add(len - 2, top.clone());
	}

	public void dup() {
		stack.add(stack.get(stack.size() - 1));
	}

	public void clear() {
		stack.clear();
	}

	public boolean isEmpty() {
		return stack.isEmpty();
	}

	@Override
	public String toString() {
		return stack.toString();
	}

}
