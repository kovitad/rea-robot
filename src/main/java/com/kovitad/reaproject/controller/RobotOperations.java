package com.kovitad.reaproject.controller;

import com.kovitad.reaproject.model.SquareTable;


public interface RobotOperations {
	public enum Facing {
		NORTH, SOUTH, EAST, WEST
	}
	public void putOnTable(SquareTable table);
	public void place(Facing direction,int x,int y);
	public void move();
	public void left();
	public void right();
	public String report();
	
}
