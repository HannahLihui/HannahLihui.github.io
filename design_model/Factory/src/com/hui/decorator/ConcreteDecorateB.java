package com.hui.decorator;

public class ConcreteDecorateB extends Decorator{
	
	@Override
	public void Operation(){
		super.Operation();
		AddedBehavior();
		System.out.println("����B�ľ������");
	}

	private void AddedBehavior() {
		// TODO Auto-generated method stub
		
	}
	


}
