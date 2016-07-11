package com.kovitad.reaproject;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.kovitad.reaproject.model.Robot;
import com.kovitad.reaproject.model.Robot.Facing;

public class TestRobotOperations {
	Robot myRobot = null;
	@Before
	public void initRobot() {
		myRobot = new Robot();
	}
	@Test
	public void testPlaceRobot() {
		myRobot.place(Facing.NORTH, 4, 5);
		assertEquals(Facing.NORTH, myRobot.getFacing());
		assertEquals(4, myRobot.getX());
		assertEquals(5,myRobot.getY());
	}
	
	@Test
	public void testMoveRobotBeforePlacing() {
		myRobot.move();	
		assertEquals(null, myRobot.getFacing());
		assertEquals(0, myRobot.getX());
		assertEquals(0,myRobot.getY());

	}
	@Test
	public void testMoveRobotAfterPlacingOnTheTable() {
		//TODO
	}

	

}
