package _01_methods._1_houses;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
	
	public void run() {
		
	
		// Check the recipe to find out what code to put here
		Robot rob = new Robot();
		rob.moveTo(25, 500);
		rob.penDown();
		rob.miniaturize();
		rob.setPenWidth(25);
		rob.setSpeed(100);
		int h = 100;
		drawFlatRoof(rob, h);
		drawPointyRoof(rob, h);
	}

	private void drawPointyRoof(Robot rob, int h) {
		rob.setRandomPenColor();
		rob.move(h);
		rob.turn(45);
		rob.move(40);
		rob.turn(90);
		rob.move(40);
		rob.turn(45);
		rob.move(h);
		rob.turn(-90);
		rob.setPenColor(0, 150, 0);
		rob.move(35);
		rob.turn(-90);
		
	}

	private void drawFlatRoof(Robot rob, int h) {
		rob.setRandomPenColor();
		rob.move(h);
		rob.turn(90);
		rob.move(50);
		rob.turn(90);
		rob.move(h);
		rob.turn(-90);
		rob.setPenColor(0, 150, 0);
		rob.move(35);
		rob.turn(-90);
		
	}

}