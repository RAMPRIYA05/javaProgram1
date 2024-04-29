package com.chainsys.collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class Collection {

	public static void main(String[] args)
	{
		ArrayList array=new ArrayList();
		for(int i=1;i<=6;i++)
		{
			array.add(i);
			System.out.println(array);
		}
		array.add(3,7);
		System.out.println(array);
		array.add("priya");
		System.out.println(array);
		
		
		ArrayList bookList=new ArrayList();
		for(int i=1;i<2;i++) {
		bookList.add("Thriller");
		bookList.add("Gone girl");
		bookList.add("2012");
		System.out.println(bookList);
		}
		bookList.clear();
		System.out.println(bookList);
		array.clone();
		System.out.println(array);
		  
		  ArrayList<Boolean> arr1=new ArrayList<Boolean>();
		  arr1.isEmpty();
		  System.out.println(arr1);
		  boolean arr2=arr1.isEmpty();
		  if(arr2==true)
		  {
			  System.out.println("arr2 is empty");
		  }
		  else
		  {
			  System.out.println("arr2 is not empty");
		  }
		  System.out.println(array);
		  int size=array.size();
		  System.out.println("size:"+size);
		  
		  ArrayList arr=new ArrayList();
		  for(int i=1;i<=5;i++) 
		  {
		    arr.add(i);
		  }
		  System.out.println("ArrayList add:"+arr);
		  System.out.println("ArrayList size:"+arr.size());
		  System.out.println("ArrayList hashcode:"+arr.hashCode());
		  System.out.println("ArrayList indexof:"+arr.indexOf(3));
		  System.out.println("ArrayList last index of:"+arr.lastIndexOf(4));
		  System.out.println(arr);
		  Iterator i1=arr.iterator();
		  System.out.println("Iterator:");
		  while(i1.hasNext())
		  {
			  System.out.println(i1.next());
		  }
		  //System.out.println("ArrayList iterator:"+arr.iterator());
		  System.out.println("ArrayList clone:"+arr.clone());
		  arr.trimToSize();
		  System.out.println("ArrayList trim to size: "+arr);
		  System.out.println("ArrayList contains:"+arr.contains(4));
		  System.out.println("ArrayList empty:"+arr.isEmpty());
		  System.out.println("ArrayList get:"+arr.get(3));
		  System.out.println("ArrayList remove:"+arr.remove(3));
		  System.out.println("Array List:"+arr);
		  arr.clear();
		  System.out.println("ArrayList clear:"+arr);
		  
		  HashSet<Integer> hash=new HashSet();
		  hash.add(1);
		  hash.add(2);
		  System.out.println(hash);
		  hash.add(10);
		  System.out.println(hash);
		  System.out.println("HashSet size:"+hash.size());
		  System.out.println("HashSet contains:"+hash.contains(6));
		  System.out.println("HashSet clone:"+hash.clone());
		  System.out.println("HashSet hashcode:"+hash.hashCode());
		  System.out.println("HashSet boolean:"+hash.isEmpty());
		  //System.out.println("HashSet iterator:"+hash.iterator());
		  Iterator i2=hash.iterator();
		  System.out.println("Iterator:");
		  while(i2.hasNext())
		  {
			  System.out.println(i2.next());
		  }
		  System.out.println("HashSet remove():"+hash.remove(1));
		  System.out.println("HashSet:"+hash);
		  hash.clear();
		  System.out.println("HashSet clear:"+hash);
		 
		  Stack <String>stack=new <String>Stack();
		  stack.push("Ram");
		  stack.push("priya");
		  stack.push("Rampriya");
		  System.out.println(stack);
		  stack.pop();
		  System.out.println(stack);
		  System.out.println("stack hash code"+stack.hashCode());
		  
		  
		  LinkedList list=new LinkedList();
		  for(int i=1;i<=5;i++)
		  {
		  list.add(i);
		  }
		  System.out.println("Linked List add:"+list);
		  list.clone();
		  System.out.println("Linked List clone:"+list);
		  //list.listIterator();
		  //System.out.println("Linked List iterator"+list);
		  Iterator i3=list.iterator();
		  System.out.println("Iterator:");
		  while(i3.hasNext())
		  {
			  System.out.println(i3.next());
		  }
//		  list.hashCode();
		  System.out.println("Linked List hashcode:"+list.hashCode());
		  System.out.println("Linked List size:"+list.size());
		  System.out.println("Linked List firstpeek:"+list.peekFirst());
		  System.out.println("Linked List lastpeek:"+list.peekLast());
		  System.out.println("Linked List remove last:"+list.removeLast());
		  System.out.println("Linked List contains:"+list.contains(2));
		  System.out.println("Linked List poll:"+list.poll());
		  list.clear();
		  System.out.println("Linked List clear:"+list);

		  
		  Vector vector=new Vector();
		  for(int i=1;i<=5;i++) {
			  vector.add(i);
		  }
		      System.out.println("vector add:"+vector);
		      vector.clone();
			  System.out.println("vector clone:"+vector);
			  Iterator i4=vector.iterator();
			  System.out.println("Iterator:");
			  while(i4.hasNext())
			  {
				  System.out.println(i4.next());
			  }
			  System.out.println("capacity:"+vector.capacity());
			  vector.ensureCapacity(20);
			  System.out.println("vector capacity:"+vector.capacity());
			  System.out.println("vector first element:"+vector.firstElement());
			  System.out.println("vector last element:"+vector.lastElement());
			  
			  System.out.println("vector size:"+vector.size());
			  System.out.println("vector removeall:"+vector.removeAll(vector));
			  
			 
		  
	}
}
