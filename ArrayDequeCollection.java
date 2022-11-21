package Generic;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeCollection {
	public static void main(String[] args) {
		Deque<String> deq = new ArrayDeque<String>();
		// Deque<String> deq = new LinkedList<>();
		// 이렇게도 가능.
		
		// LinkedList<E>가 구현하는 인터페이스들
		// Deque<E>, List<E>, Queue<E>
		
		// 앞으로 넣고
		deq.offerFirst("1. Box");
		deq.offerFirst("2. Toy");
		deq.offerFirst("3. Robot");
		
		// 앞에서 꺼내기
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
		
	}
}
