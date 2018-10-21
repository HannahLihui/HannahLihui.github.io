package com.hui.shop;
//CashContext用于选择不同的算法
public class CashContext {
	public static final int CASH_NORMAL=1;
	public static final int CASH_RETRN50=2;
	public static final int CASH_RETURN100=3;
	public static final int CASH_REBATE6=4;
	public static final int CASH_REBATE8=5;
	double total=0;
	CashSuper cs=null;
	public CashContext(int type){
		switch (type){
		case 1:
			cs=new CashNormal();
			break;
		case 2:
			cs=new CashReturn(50);
			break;
		case 3:
			cs=new CashReturn(100);
			break;
		case 4:
			cs=new CashRebate(0.6);
			break;
		case 5:
			cs=new CashRebate(0.8);
			break;
		default:
			cs=new CashNormal();
		}
	}
	public double getResult(double money){
		return cs.acceptCash(money);
	}

}
