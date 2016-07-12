package com.kovitad.reaproject.model;


import com.kovitad.reaproject.controller.RobotOperations.Facing;


public class Robot  {
	
	private int x;
	private int y;
	private Facing facing;
	private SquareTable table;
	private boolean isOnTable;
	private boolean isInPlace;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Facing getFacing() {
		return facing;
	}
	public void setFacing(Facing facing) {
		this.facing = facing;
	}
	public SquareTable getTable() {
		return table;
	}
	public void setTable(SquareTable table) {
		this.table = table;
	}
	public boolean isOnTable() {
		return isOnTable;
	}
	public boolean isInPlace() {
		return isInPlace;
	}
}
