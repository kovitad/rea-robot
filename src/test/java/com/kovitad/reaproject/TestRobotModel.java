package com.kovitad.reaproject;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.kovitad.reaproject.model.Robot;

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
	@Test
	public void testGetDefaultOntableValue() {
		assertEquals(false, myRobot.isOnTable());
	}
	@Test
	public void testGetDefaultOnPlaceValue() {
		assertEquals(false, myRobot.isInPlace());
	}
	

}
