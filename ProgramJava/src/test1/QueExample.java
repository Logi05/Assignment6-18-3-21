package test1;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueExample {
	public static void main(String args[]) {
		PriorityQueue<String> q=new PriorityQueue<String>();
		q.add("");
		q.add("xyz");
		q.add("abc");
		q.add("pqr");
		
		System.out.println("head:"+q.element());
		System.out.println("head:"+q.peek());
		
		Iterator<String> It=q.iterator();
		while(It.hasNext())
		{
			System.out.println(It.next());
		}
		
		q.remove();
		q.poll();
		System.out.println("After Removing");
		
		for(String s:q)
		{
			System.out.println(s);
		}
		
		System.out.println();
		System.out.println("Another Queue");
		PriorityQueue<String> q1=new PriorityQueue<String>();

		q1.add("xyz");
		q1.add("abc");
		q1.add("pqr");
		
		System.out.println("head:"+q1.element());
		System.out.println("head:"+q1.peek());
		
		for(String s:q1)
		{
			System.out.println(s);
		}

		q1.remove();
		q1.poll();
		System.out.println("After Removing");
		

		Iterator<String> It1=q1.iterator();
		while(It1.hasNext())
		{
			System.out.println(It1.next());
		}
		System.out.println();
		System.out.println("One more queue");	
		PriorityQueue<String> q2=new PriorityQueue<String>();
		/*q.add(3);
		q.add(6);
		q.add(9);
		q.add(2);*/
		System.out.println("head:"+q2.peek());
		//System.out.println("head:"+q1.peek());	
	
	
	PriorityQueue<String> q3=new PriorityQueue<String>();
	/*q.add(3);
	q.add(6);
	q.add(9);
	q.add(2);*/
	System.out.println("head:"+q3.element());
		
	}
}

