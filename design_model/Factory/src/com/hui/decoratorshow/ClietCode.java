package com.hui.decoratorshow;

public class ClietCode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person hui=new Person("灰灰");
		System.out.println("第一种装扮");
		Sneakers sn=new Sneakers();
		BigTrouser tr=new BigTrouser();
		Tshirts tsh=new Tshirts();
		sn.Decorate(hui);
		tr.Decorate(sn);
		tsh.Decorate(tr);
		tsh.show();
		
		System.out.println("第二种装扮");
		tr.Decorate(hui);
		tsh.Decorate(tr);
		sn.Decorate(tsh);
		sn.show();
	}

}
