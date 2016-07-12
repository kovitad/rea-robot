package com.kovitad.reaproject;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.kovitad.reaproject.exception.UnSupportedOperationsException;
import com.kovitad.reaproject.model.SquareTable;

public class TestSquareTableModel {
	private SquareTable table = null;
	@Before
	public void setUpSquareTable() {
		table = new SquareTable(5, 5);
	}
	
	@Test
	public void testSetTableToZeroDimentions(){
		try {
			table = new SquareTable(5, 0);
		}catch(UnSupportedOperationsException t) {
			assertEquals("Unsupported Operations Error", t.getMessage());
		}
	
	}
	@Test
	public void testSetWidthOfTheTable() {
		fail("Not yet implemented");
	}
	@Test
	public void testSetHeightOfTheTable() {
		fail("Not yet impolemented");
	}
}
