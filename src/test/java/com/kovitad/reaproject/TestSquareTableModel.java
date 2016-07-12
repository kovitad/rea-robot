package com.kovitad.reaproject;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.kovitad.reaproject.model.SquareTable;

public class TestSquareTableModel {
	private SquareTable table = null;
	@Before
	public void setUpSquareTable() {
		table = new SquareTable(5, 5);
	}
	
	@Test
	public void testSetTableToZeroDimention(){
		fail("Not yet implemented");
	}
	@Test
	public void testSetWidthOfTheTable() {
		fail("Not yet implemented");
	}
	public void testSetHeightOfTheTable() {
		fail("Not yet impolemented");
	}
}
