package com.kovitad.reaproject;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.kovitad.reaproject.controller.RobotController;
import com.kovitad.reaproject.controller.RobotOperations;
import com.kovitad.reaproject.controller.RobotOperations.Facing;
import com.kovitad.reaproject.model.Robot;
import com.kovitad.reaproject.model.SquareTable;


public class TestRobotOperations {
	RobotOperations controller = null;
	@Before
	public void initRobot() {
		controller = new RobotController(new Robot(), new SquareTable(5,5));
	}
	@Test
	public void testPutRobotOnTheTable() {
		controller.putOnTable(new SquareTable(5, 5));
		assertEquals("The Robot is on the table", controller.report());
	}
	@Test
	public void testPlaceRobotWithOutPlaceOnTheTable() {
		controller.place(com.kovitad.reaproject.controller.RobotOperations.Facing.NORTH, 0, 0);
		assertEquals("Operation Error : the Robot can not be placed", controller.report());
	}
	
	@Test
	public void testMoveRobotBeforePlacingOnTheTable() {
		controller.move();	
		assertEquals("Operation Error : the Robot can not be moved", controller.report());

	}
	@Test
	public void testMoveRobotOneUnit() {
		controller.putOnTable(new SquareTable(5, 5));
		controller.place(com.kovitad.reaproject.controller.RobotOperations.Facing.NORTH, 0, 0);
		assertEquals("0,1,NORTH", controller.report());
	}
	

	@Test
	public void testPlaceRobotOnTheLeft() {
		controller.putOnTable(new SquareTable(5, 5));
		controller.place(com.kovitad.reaproject.controller.RobotOperations.Facing.NORTH, 0, 0);
		controller.left();
		assertEquals("0,0,WEST", controller.report());
	}
	
	@Test 
	public void testMoveRobotToAndThenLeft() {
		controller.putOnTable(new SquareTable(5, 5));
		controller.place(com.kovitad.reaproject.controller.RobotOperations.Facing.NORTH, 0, 0);
		controller.move();
		controller.move();
		controller.left();
		controller.move();
		assertEquals("3,3,NORTH", controller.report());
	}
	@Test
	public void testMoveRobotOutOfTheEdgeOfTheTable() {
		controller.putOnTable(new SquareTable(5, 5));
		controller.place(Facing.NORTH, 0, 0);
		controller.move();
		controller.move();
		controller.move();
		controller.move();
		controller.move();
		controller.move();
		assertEquals("Operation Error : Cannot move the robot out of the table", controller.report());
	}

	
}
