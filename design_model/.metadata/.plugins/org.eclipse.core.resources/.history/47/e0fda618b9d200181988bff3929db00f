package com.hui.calculate;

import java.util.Scanner;

class Operation{
	double num1;
	double num2;
	public Operation(){
		num1=0;
		num2=0;
	}
	public Operation(double num1,double num2){
		this.num1=num1;
		this.num2=num2;
	}
	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	public double getResult(){
		double result=0;
		return result;
		
	}
}
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
class MultiOperation extends Operation{
	public MultiOperation(){
		num1=0;
		num2=0;
	}
	public MultiOperation(double num1, double num2) {
		super(num1, num2);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double getResult(){
		double result=num1*num2;
		return result;
	}
	
}
class DivOperation extends Operation{
	public DivOperation(){
		num1=0;
		num2=0;
	}
	public DivOperation(double num1, double num2) {
		super(num1, num2);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double getResult(){
		double result=num1/num2;
		return result;
	}
	
}

public class OperationFactory {
	
	public static Operation createOperation(char operation){
		Operation result=null;
		switch (operation){
		case '+':
			result=new AddOperation();
			break;
		case '-':
			result=new SubOperation();
			break;
		case '*':
			result=new MultiOperation();	
			break;
		case '/':
			result=new DivOperation();
			break;
		}
		return result;
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String str=null;
		try{
			System.out.print("请输入计算+或-或*或/");
			str=input.next();
		}catch(Exception ex){
			System.out.print("您的输入计算方式");
		}
		Operation oper=OperationFactory.createOperation(str.charAt(0));
		try{
		
		oper.num1=input.nextDouble();
		oper.num2=input.nextDouble();
		}catch(Exception ex){
			System.out.print("您的输入有误，"+ex.getMessage()+"请重新输入");
		}
		System.out.print("运算的结果为"+oper.getResult());

	}

}

