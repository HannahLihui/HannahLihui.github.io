package com.hui.decorator;

public class ConcreteDecorateB extends Decorator{
	
	@Override
	public void Operation(){
		super.Operation();
		AddedBehavior();
		System.out.println("对象B的具体操作");
	}

	private void AddedBehavior() {
		// TODO Auto-generated method stub
		
	}
	


}
