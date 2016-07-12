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
	public void testPutRobotOnTheTable() {
		fail("Not yet implemented");
	}
	@Test
	public void testPlaceRobotWithOutPlaceOnTheTable() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testMoveRobotBeforePlacingOnTheTable() {
		myRobot.move();	
		assertEquals(null, myRobot.getFacing());
		assertEquals(0, myRobot.getX());
		assertEquals(0,myRobot.getY());
		assertEquals("Please take the robot on the table and set the direction!", myRobot.report());

	}
	@Test
	public void testMoveRobotAfterPlacingOnTheTable() {
		//TODO
		fail("Not yet implemented");
	}
	

	@Test
	public void testMoveRobotToTheLeft() {
		fail("Not yet implemented");
	}
	
	@Test 
	public void testMoveRobotToTheRight() {
		fail("Not yet implemented");
	}
	@Test
	public void testMoveRobotToTheEdgeOfTheTable() {
		fail("Not yet implemented");
	}

	
}
