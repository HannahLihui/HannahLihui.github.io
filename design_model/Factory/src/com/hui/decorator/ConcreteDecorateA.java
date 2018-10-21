package com.hui.decorator;

public class ConcreteDecorateA extends Decorator{
	private String addedState;//用于区别ConcreteDecorateB
	@Override
	public void Operation(){
		super.Operation();//先执行Component中的Operation,在执行本类功能，相当于原类做了修饰
		addedState="New State";
		System.out.println("具体装饰对象A的操作");
	}

}
