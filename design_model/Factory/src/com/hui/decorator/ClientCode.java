package com.hui.decorator;

public class ClientCode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteComponent c=new ConcreteComponent();//���������󣬺�����Զ�������ְ��
		ConcreteDecorateA d1=new ConcreteDecorateA();//����ְ��
		ConcreteDecorateB d2=new ConcreteDecorateB();
		d1.setCompontent(c);
		d2.setCompontent(d1);
		d2.Operation();
	}

}
