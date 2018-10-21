package com.hui.decorator;

public abstract class Decorator extends Component{
	protected Component component;
	public void setCompontent(Component compontent){
		this.component=compontent;
	}
	@Override
	public void Operation(){
		if(component!=null)
			component.Operation();
	}

}
