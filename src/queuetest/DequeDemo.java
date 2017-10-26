package queuetest;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
	public static void main(String[] args) {
		Deque<Integer> deque=new ArrayDeque<>();
		deque.add(1);
		deque.add(2);
		deque.add(3);
		deque.add(4);
	//	int i=deque.pop();
		int i=deque.poll();
		System.out.println(i);
		System.out.println(deque);
	}
}
