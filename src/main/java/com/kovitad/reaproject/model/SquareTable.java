package com.kovitad.reaproject.model;

import com.kovitad.reaproject.exception.UnSupportedOperationsException;

public class SquareTable {

	int dx,dy;
	
	public SquareTable(int dxUnits, int dyUnits)  throws UnSupportedOperationsException {
		
		if(dxUnits <= 0 || dyUnits <= 0) {
			throw new UnSupportedOperationsException();
		}
		this.dx = dxUnits;
		this.dy = dyUnits;
		
	}
	public int getDx() {
		return dx;
	}
	public void setDx(int dx) {
		if(dx <= 0){
			throw new UnSupportedOperationsException();
		}
		this.dx = dx;
	}
	public int getDy() {
		return dy;
	}

	public void setDy(int dy) {
		if(dy <= 0){
			throw new UnSupportedOperationsException();
		}
		this.dy = dy;
	}

}
