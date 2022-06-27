package study0627;

import java.util.*;

public class QueueTest {
	public static void main(String[] args) {
			Queue <Integer> queueR = new LinkedList<>();
			
			queueR.add(20);
			queueR.add(30);
			queueR.add(40);
			
			while(!queueR.isEmpty()) {
				System.out.println(queueR.poll());
			}
	}
}
