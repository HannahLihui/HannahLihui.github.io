package com.hui.shop;

class CashRebate extends CashSuper{
	private double moneyRate;
	public CashRebate(){
		moneyRate=1;
	}
	public CashRebate(double rate){
		this.moneyRate=rate;
	}
	@Override
	public double acceptCash(double money) {
		// TODO Auto-generated method stub
		return money*moneyRate;
	}
	
}
