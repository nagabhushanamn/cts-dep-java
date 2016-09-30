package com.app.util;

public class LinkedList<T> {

	private Node head = null;

	public LinkedList() {
		// TODO Auto-generated constructor stub
	}

	// add
	public void add(T data) {
		Node newNode = new Node<T>(data);
		if (head == null) {
			head = newNode;
		} else {
			Node last = head;
			while (last.getNext() != null) {
				last = last.getNext();
			}
			last.setNext(newNode);
		}
	}

	public void add(int index, T data) {
		
	}

	// get

	// remove

	// siz

	private class Node<T> {

		private T data;
		private Node next;

		public Node(T data) {
			super();
			this.data = data;
		}

		public Node(T data, Node next) {
			super();
			this.data = data;
			this.next = next;
		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

	}

}
