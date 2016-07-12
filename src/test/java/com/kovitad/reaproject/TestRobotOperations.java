package com.kovitad.reaproject;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.kovitad.reaproject.controller.RobotController;
import com.kovitad.reaproject.controller.RobotOperations;
import com.kovitad.reaproject.model.Robot;
import com.kovitad.reaproject.controller.Facing;
import com.kovitad.reaproject.exception.UnSupportedOperationsException;
/*
 * @author Kovitad Janlakhon
 * 
 * Test cases for Robot Operations
 */
public class TestRobotOperations {
	RobotOperations controller = null;

	@Before
	public void initRobot() {
		controller = new RobotController(new Robot());
	}

	@Test
	public void testMoveRobotBeforePlacing() {
		controller.move();
		assertEquals("Operation Error : the Robot can not be moved",
				controller.report());

	}

	@Test
	public void testMoveRobotOneUnit() {

		controller.place(Facing.NORTH, 0, 0);
		controller.move();
		assertEquals("0,1,NORTH", controller.report());
	}

	@Test
	public void testPlaceRobotOnTheLeft() {
		controller.place(Facing.NORTH, 0, 0);
		controller.left();
		assertEquals("0,0,WEST", controller.report());
	}

	@Test
	public void testMoveRobotToAndThenLeft() {

		controller.place(Facing.EAST, 1, 2);
		controller.move();
		controller.move();
		controller.left();
		controller.move();
		assertEquals("3,3,NORTH", controller.report());
	}

	@Test
	public void testMoveRobotOutOfTheEdgeOfTheTable() {

		controller.place(Facing.NORTH, 0, 0);
		controller.move();
		controller.move();
		controller.move();
		controller.move();
		controller.move();
		try {
			controller.move();
		} catch (UnSupportedOperationsException e) {
			assertEquals(
					"Unsupported Operations Error : The robot is moving out of the table",
					e.getMessage());
		}

	}

}
