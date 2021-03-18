package test1;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueExample {
public static void main(String args[]) {
	PriorityQueue<Integer> q=new PriorityQueue<Integer>();
	q.add(3);
	q.add(6);
	q.add(9);
	q.add(2);
	
	System.out.println("head:"+q.element());
	System.out.println("head:"+q.peek());
	
	Iterator<Integer> It=q.iterator();
	while(It.hasNext())
	{
		System.out.println(It.next());
	}
	
	q.remove();
	q.poll();
	System.out.println("After Removing");
	
	for(Integer s:q)
	{
		System.out.println(s);
	}
	
	System.out.println();
	System.out.println("Another queue");
	PriorityQueue<Integer> q2=new PriorityQueue<Integer>();
	System.out.println("head:"+q2.peek());
	System.out.println();
	
	System.out.println("One more queue");	
	PriorityQueue<Integer> q1=new PriorityQueue<Integer>();
	/*q.add(3);
	q.add(6);
	q.add(9);
	q.add(2);*/
	System.out.println("head:"+q1.element());
	//System.out.println("head:"+q1.peek());	
}
}
