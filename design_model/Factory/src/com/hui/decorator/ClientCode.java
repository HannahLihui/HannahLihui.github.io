package com.hui.decorator;

public class ClientCode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteComponent c=new ConcreteComponent();//定义具体对象，后面可以对它增加职责
		ConcreteDecorateA d1=new ConcreteDecorateA();//增加职责
		ConcreteDecorateB d2=new ConcreteDecorateB();
		d1.setCompontent(c);
		d2.setCompontent(d1);
		d2.Operation();
	}

}
