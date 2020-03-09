package com.ConstructorInjection;

import java.util.Iterator;
import java.util.List;

public class ConstructorInjectionWithCollection 
{
	private int id;
	private String question;
	private List<String> answer;
	
	public ConstructorInjectionWithCollection(int id, String question, List<String> answer)
	{
		this.id = id;
		this.question = question;
		this.answer = answer;
	}
	
	public void showDetail()
	{
		System.out.println("Id:"+id);
		System.out.println("Question:"+question);
		System.out.println("Answer are:");
		Iterator<String> itr=answer.iterator();  
	    while(itr.hasNext()){  
	        System.out.println(itr.next());  
	    }
	}
}
