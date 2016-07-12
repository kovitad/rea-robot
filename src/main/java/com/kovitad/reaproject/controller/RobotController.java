package com.kovitad.reaproject.controller;

import com.kovitad.reaproject.event.EventListener;
import com.kovitad.reaproject.model.Robot;
import com.kovitad.reaproject.model.SquareTable;

public class RobotController implements RobotOperations , EventListener{

	private Robot robot = null;
	private SquareTable table = null;
	public RobotController(Robot robot,SquareTable table) {
		this.robot = robot;
		this.table = table;
	}
	
	@Override
	public void putOnTable(SquareTable table) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void place(Facing direction, int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move() {
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

	@Override
	public void onTable() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPlace() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onEdgeCrash() {
		// TODO Auto-generated method stub
		
	}

}
