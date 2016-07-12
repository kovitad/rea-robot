package com.kovitad.reaproject;

import java.util.Scanner;

import com.kovitad.reaproject.controller.Facing;
import com.kovitad.reaproject.controller.RobotController;
import com.kovitad.reaproject.model.Robot;

/**
 * REA ROBOT VERSION 3
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner scanner = new Scanner(System.in);
    	RobotController controller = new RobotController(new Robot());
    	System.out.println("Please command the robot:");
    	while(true) {
    		String command = scanner.next();
    		if(command.equals("PLACE")) {
    			int x = 0,y = 0;
    			boolean validDirection = false;
    			boolean validLocation = false;
    			//next command need to be location and direction
    			try {
	    			String location = scanner.next();
	    			String[] locationCmds = location.split(",");
	    			x = Integer.parseInt(locationCmds[0]);
	    			y = Integer.parseInt(locationCmds[1]);
	    			validLocation = true;
    			}catch (NumberFormatException n){
    				System.out.println("Invalid Command!");
    			}catch (ArrayIndexOutOfBoundsException a){
    				System.out.println("Invalid Command!");
    			}
    			Facing direction = null;
    			try {
    				direction =Facing.valueOf(scanner.next());
    				validDirection = true;
    			}catch (IllegalArgumentException i){
    				System.out.println("Invalid Command!");
    			}
    			if(validLocation && validDirection) {
    				controller.place(direction, x, y);
    			}
    			
    		} else if(command.equals("MOVE")){
    			controller.move();
    		} else if(command.equals("LEFT")){
    			controller.left();
    		} else if(command.equals("RIGHT")){
    			controller.right();
    		}else if(command.equals("REPORT")){
    			System.out.println(controller.report());
    		} else if(command.equals("EXIT")) {
    			System.out.println("Good Bye!");
    			break;
    		} else {
    			System.out.println("Invalid Command!");
    		}
    	}
    	scanner.close();
    	
    	
    	
    }
}
