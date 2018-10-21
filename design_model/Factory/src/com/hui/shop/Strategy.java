package com.hui.shop;

import java.util.Scanner;

public class Strategy {
	private static CashContext chooseChargeType(){
		Scanner	scanner=new Scanner(System.in);
		//simulation the progress of charge 
		System.out.println("please choose one way to charge:");
		System.out.println("-------------------------------");
		System.out.println("1 for CASH_TYPE_NORMAL");
		System.out.println("2 for CASH_TYPE_RETURN50");
		System.out.println("3 for CASH_TYPE_RETURN100");
		System.out.println("4 for CASH_TYPE_REBATE6");
		System.out.println("5 for CASH_TYPE_REBATE8");
		System.out.println("-------------------------------");
		int type=Integer.parseInt(scanner.nextLine());
			CashContext cashContext=null;
			switch(type){
				case CashContext.CASH_NORMAL:
				cashContext=new CashContext(CashContext.CASH_NORMAL);
				break;
			
				case CashContext.CASH_RETRN50:
				cashContext=new CashContext(CashContext.CASH_RETRN50);
				break;
			
				case CashContext.CASH_RETURN100:
				cashContext=new CashContext(CashContext.CASH_RETURN100);
				break;
			
				case CashContext.CASH_REBATE6:
				cashContext=new CashContext(CashContext.CASH_REBATE6);
				break;
			
				case CashContext.CASH_REBATE8:
				cashContext=new CashContext(CashContext.CASH_REBATE8);
				break;
			
				default:cashContext=new CashContext(CashContext.CASH_NORMAL);
				
			}
		return  cashContext;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CashContext context=new CashContext(CashContext.CASH_NORMAL);
		Scanner scanner=new Scanner(System.in);
		System.out.println("intput Singel Price " +
				"with Decimal, STRIKE button C to Change Type");
		String t=scanner.nextLine();
		double single=0;//单价
		double number=0;//数量
		double total=0;//总价
		if(t.equals("c")){
			context=chooseChargeType();
			try{
			System.out.println("intput Singel Price with Decimal");
			single=Double.valueOf(scanner.nextLine());
			}catch(Exception e){
				System.out.print("Invalid input,try again!");
			}
			
			
			
		}else{

			try{
				single=Double.valueOf(t);
			}catch(Exception e){
				System.out.print("Invalid input,try again!");
			}
			
		}
		System.out.println("intput counts for numbers");
		try{
			number=Double.valueOf(scanner.nextLine());
		}catch(Exception e){
			System.out.print("Invalid input,try again!");
		}
		total=context.getResult(single*number);
		System.out.print("total money is"+total);
		
		

	}

}
