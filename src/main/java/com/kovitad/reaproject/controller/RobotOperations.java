package com.kovitad.reaproject.controller;

public interface RobotOperations {

	public void place(Facing direction, int x, int y);

	public void move();

	public void left();

	public void right();

	public String report();

}
