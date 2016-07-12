package com.kovitad.reaproject.controller;

import com.kovitad.reaproject.event.EventListener;
import com.kovitad.reaproject.exception.UnSupportedOperationsException;
import com.kovitad.reaproject.model.Robot;


public class RobotController implements RobotOperations , EventListener{
	
	private Robot robot = null;
	
	
	public RobotController(Robot robot) {
		this.robot = robot;	
		this.robot.register(this);
	}
	

	@Override
	public void place(Facing direction, int x, int y) {
		this.robot.setX(x);
		this.robot.setY(y);
		this.robot.setFacing(direction);
		this.robot.setInPlace(true);	
	}

	@Override
	public void move() {
		if(this.robot.isInPlace()) {
				
				switch (this.robot.getFacing()) {
				case NORTH:
					this.robot.setY(this.robot.getY()+1);
					break;
				case EAST:
					this.robot.setX(this.robot.getX()+1);
					break;
				case SOUTH:
					this.robot.setX(this.robot.getX()-1);
					break;
				case WEST:
					this.robot.setY(this.robot.getY()-1);
					break;
				default:
					break;
		
				}
			}

		
	}

	@Override
	public void left() {
		if(this.robot.isInPlace() ) {
			switch (this.robot.getFacing()) {
			case NORTH:
				this.robot.setFacing(Facing.WEST);
				break;
			case WEST:
				this.robot.setFacing(Facing.SOUTH);
				break;
			case SOUTH:
				this.robot.setFacing(Facing.EAST);
				break;
			case EAST:
				this.robot.setFacing(Facing.NORTH);
				break;
			default:
				break;
	
			}
		}
		
	}

	@Override
	public void right() {
		if(this.robot.isInPlace() ) {
			switch (this.robot.getFacing()) {
			case NORTH:
				this.robot.setFacing( Facing.EAST );
				break;
			case EAST:
				this.robot.setFacing( Facing.SOUTH );
				break;
			case SOUTH:
				this.robot.setFacing( Facing.WEST);
				break;
			case WEST:
				this.robot.setFacing( Facing.NORTH);
				break;
			default:
				break;
	
			}
		}
		
	}

	@Override
	public String report() {
		if(this.robot.isInPlace() ) {
			return this.robot.getX() + "," + this.robot.getY() + "," + this.robot.getFacing().toString();
		} else {
			return "Operation Error : the Robot can not be moved";
		}
	}

	

	@Override
	public void onPlace() {
		// TODO Auto-generated method stub
		System.out.println("Place");
	}

	@Override
	public void onEdgeCrash() {
		System.out.println("On Edge Crash");
		throw new UnSupportedOperationsException("The robot is moving out of the table");
		
	}
	
	
	

}
