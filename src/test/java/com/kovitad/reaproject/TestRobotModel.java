package com.kovitad.reaproject;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.kovitad.reaproject.model.Robot;
/*
 * @author Kovitad Janlakhon
 * 
 * Test the robot model
 */
public class TestRobotModel {
	Robot myRobot = null;

	@Before
	public void initRobot() {
		myRobot = new Robot();
	}

	@Test
	public void testCreateNewRobot() {
		assertNotNull(myRobot);
	}

	@Test
	public void testGetDefaultFacingValue() {
		assertNull(myRobot.getFacing());
	}

	@Test
	public void testGetDefaultXValue() {
		assertNull(myRobot.getFacing());
	}

	@Test
	public void testGetDefaultYValue() {
		assertEquals(0, myRobot.getY());
	}

}
