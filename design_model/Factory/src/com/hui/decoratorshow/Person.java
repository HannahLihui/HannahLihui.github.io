package com.hui.decoratorshow;

public class Person {
	public String name;
	public Person(){
		
	}
	public Person(String name){
		this.name=name;
	}
	public void show(){
		System.out.println("×°°çµÄ"+name);
	}

}
