package com.hui.calculate;

class AddOperation extends Operation{
	public AddOperation(){
		num1=0;
		num2=0;
	}
	public AddOperation(double num1, double num2) {
		super(num1, num2);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double getResult(){
		double result=num1+num2;
		return result;
	}
	
}
