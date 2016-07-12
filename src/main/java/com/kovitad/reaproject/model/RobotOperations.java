package com.kovitad.reaproject.model;

import com.kovitad.reaproject.model.Robot.Facing;

public interface RobotOperations {
	public void putOnTable(SquareTable table);
	public void place(Facing direction,int x,int y);
	public void move();
	public void left();
	public void right();
	public String report();
	
}
