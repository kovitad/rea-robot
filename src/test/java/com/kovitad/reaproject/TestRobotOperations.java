package com.kovitad.reaproject;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.kovitad.reaproject.model.Robot;
import com.kovitad.reaproject.model.SquareTable;
import com.kovitad.reaproject.model.Robot.Facing;

public class TestRobotOperations {
	Robot myRobot = null;
	@Before
	public void initRobot() {
		myRobot = new Robot();
	}
	@Test
	public void testPutRobotOnTheTable() {
		myRobot.putOnTable(new SquareTable(5, 5));
		assertEquals("The Robot is on the table", myRobot.report());
	}
	@Test
	public void testPlaceRobotWithOutPlaceOnTheTable() {
		myRobot.place(Facing.NORTH, 0, 0);
		assertEquals("Operation Error : the Robot can not be placed", myRobot.report());
	}
	
	@Test
	public void testMoveRobotBeforePlacingOnTheTable() {
		myRobot.move();	
		assertEquals("Operation Error : the Robot can not be moved", myRobot.report());

	}
	@Test
	public void testMoveRobotOneUnit() {
		myRobot.putOnTable(new SquareTable(5, 5));
		myRobot.place(Facing.NORTH, 0, 0);
		assertEquals("0,1,NORTH", myRobot.report());
	}
	

	@Test
	public void testPlaceRobotOnTheLeft() {
		myRobot.putOnTable(new SquareTable(5, 5));
		myRobot.place(Facing.NORTH, 0, 0);
		myRobot.left();
		assertEquals("0,0,WEST", myRobot.report());
	}
	
	@Test 
	public void testMoveRobotToAndThenLeft() {
		myRobot.putOnTable(new SquareTable(5, 5));
		myRobot.place(Facing.NORTH, 0, 0);
		myRobot.move();
		myRobot.move();
		myRobot.left();
		myRobot.move();
		assertEquals("3,3,NORTH", myRobot.report());
	}
	@Test
	public void testMoveRobotOutOfTheEdgeOfTheTable() {
		myRobot.putOnTable(new SquareTable(5, 5));
		myRobot.place(Facing.NORTH, 0, 0);
		myRobot.move();
		myRobot.move();
		myRobot.move();
		myRobot.move();
		myRobot.move();
		myRobot.move();
		assertEquals("Operation Error : Cannot move the robot out of the table", myRobot.report());
	}

	
}
