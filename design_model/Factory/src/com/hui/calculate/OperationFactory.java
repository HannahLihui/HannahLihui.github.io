package com.hui.calculate;

import java.util.Scanner;

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

