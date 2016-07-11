package com.kovitad.reaproject.model;

public class Robot implements RobotOperations{
	
	public enum Facing {
		NORTH, SOUTH, EAST, WEST
	}
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
	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void place(Facing direction, int x, int y) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void left() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void right() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String report() {
		// TODO Auto-generated method stub
		return null;
	}
}
