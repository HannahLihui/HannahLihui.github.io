package com.hui.decorator;

public class ConcreteDecorateA extends Decorator{
	private String addedState;//��������ConcreteDecorateB
	@Override
	public void Operation(){
		super.Operation();//��ִ��Component�е�Operation,��ִ�б��๦�ܣ��൱��ԭ����������
		addedState="New State";
		System.out.println("����װ�ζ���A�Ĳ���");
	}

}
