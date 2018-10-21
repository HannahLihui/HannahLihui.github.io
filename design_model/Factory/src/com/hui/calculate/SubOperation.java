package com.hui.calculate;

class SubOperation extends Operation{
	public SubOperation(){
		num1=0;
		num2=0;
	}

	public SubOperation(double num1, double num2) {
		super(num1, num2);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double getResult(){
		double result=num1-num2;
		return result;
	}
	
}
