package com.kovitad.reaproject.event;

/*
 * 
 * The Event Listener for REA Robot Operations
 * 
 */
public interface EventListener {
	public void onTable();
	public void onPlace();
	public void onEdgeCrash();
}
