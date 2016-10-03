package com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

class ListCompare {
	public void compare(List<String> list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			list.add("item-" + 1);
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start + " ms");
	}
}

public class List_Colln_Ex {

	public static void main(String[] args) {

		// List<String> list = new ArrayList<>(); // array
		// list.add("Nag");
		// list.add(0, "Indu");
		// list.add("Ria");
		// list.add("Ria");
		//
		// System.out.println(list);
		//
		// List<String> list2 = new LinkedList<>(); // double linked-list
		// list2.add("Nag");
		// list2.add(0, "Indu");
		// list2.add("Ria");
		// list2.add("Ria");
		//
		// System.out.println(list2);

		// -----------------------------------------------------

		// ListCompare listCompare = new ListCompare();
		// listCompare.compare(new ArrayList<>());
		// listCompare.compare(new LinkedList<>());

		// ----------------------------------------------------

		// Vector<String> vector=new Vector<>(); // array + thread safe
		// vector.add("Nag");
		//
		// ---------------------------------------------------

		// Stack<String> stack = new Stack<>();
		// stack.add("A");
		// stack.push("B");
		//
		// // System.out.println(stack.peek());
		//
		// while (!stack.isEmpty()) {
		// System.out.println(stack.pop());
		// }

		// ---------------------------------------------------

	}
}
