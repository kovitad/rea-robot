package com.kovitad.reaproject.model;

import com.kovitad.reaproject.controller.Facing;
import com.kovitad.reaproject.event.EventListener;




public class Robot  {
	
	private int x;
	private int y;
	private Facing facing;
	private boolean isInPlace;
	private EventListener eventListener;
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		if(x >5) {
			this.eventListener.onEdgeCrash();
		}
		this.x = x;
	}
	public int getY() {
		
		return y;
	}
	public void setY(int y) {
		if(y >5) {
			this.eventListener.onEdgeCrash();
		}
		this.y = y;
	}
	public Facing getFacing() {
		return facing;
	}
	public void setFacing(Facing facing) {
		this.facing = facing;
	}
	public boolean isInPlace() {
		return isInPlace;
	}
	public void setInPlace(boolean isInPlace) {
		
		this.isInPlace = isInPlace;
	}
	
	public void register(EventListener event) {
		this.eventListener = event;
	}

}