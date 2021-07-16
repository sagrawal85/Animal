package com.shyam.animal.butterfly;

public abstract class Metamorphosis{
	protected Metamorphosis nextMetamorphose;
    
	public void acceptMetamorphosis(Processing process) {
		 if (this.canMetamorphose(process.getDays())) {
	            this.doMetamorphosing(process);
	        } else if (nextMetamorphose != null) {
	        	nextMetamorphose.acceptMetamorphosis(process);
	        }
	}
	
	public void setNext(Metamorphosis metamorphosis) {
        this.nextMetamorphose = metamorphosis;
    }
	
	protected abstract boolean canMetamorphose(int numberOfDays);
    
    protected abstract void doMetamorphosing(Processing process);
}
