package com.chainsys.project;

import java.util.ArrayList;

import com.chainsys.demo2.Book;

public class collection {

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
		
		  
		  
	}
}
