package sample_1;

import java.util.*;

public class ReverseListUsingStack {
	static class Node_Leaf {
// **Sekhar** define the leaf node & the input data
		int data;
		Node_Leaf next;
	}

	static Node_Leaf head = null;

	static void push(int new_data) {
		Node_Leaf new_node = new Node_Leaf();
		new_node.data = new_data;
		new_node.next = (head);
		(head) = new_node;
	}

	static Node_Leaf reverseList(Node_Leaf head) {
		Stack<Node_Leaf> stk_sekhar = new Stack<Node_Leaf>();
// **Sekhar** King gets all the data of head ( all the inputs technically ) 
		Node_Leaf king = head;
		while (king.next != null) {
// **sekhar** this is where you get the output stack string
			stk_sekhar.push(king);
			king = king.next;
		}
// **sekhar** head now becomes first element & next is null
		head = king;
		while (!stk_sekhar.isEmpty()) {
			king.next = stk_sekhar.peek();
			king = king.next;
			stk_sekhar.pop();
		}
		king.next = null;
		return head;
	}

	static void printList(Node_Leaf head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	public static void main(String[] args) {
		push(15);
		push(42);
		push(32);
		push(23);
		push(13);
		head = reverseList(head);
		printList(head);
	}
}


/*
o/p

15 42 32 23 13 

*/
