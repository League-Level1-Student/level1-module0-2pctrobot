package _01_methods._1_houses;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
	
	public void run() {
		
	
		// Check the recipe to find out what code to put here
		Robot rob = new Robot("mini");
		rob.moveTo(10, 875);
		rob.penDown();
		rob.miniaturize();
		rob.setPenWidth(25);
		rob.setSpeed(10);
		decider(rob);
		decider(rob);
		decider(rob);
		decider(rob);
		decider(rob);
		decider(rob);
		decider(rob);
		decider(rob);
		decider(rob);
		decider(rob);
		decider(rob);
		decider(rob);
		decider(rob);
		decider(rob);
		decider(rob);
		decider(rob);
		decider(rob);
		decider(rob);
		decider(rob);
		decider(rob);
	}

	

	private void decider(Robot rob) {
		Random ran = new Random();
		int randomChoice = ran.nextInt (199 - 0 + 1) + 0;
		int h = randomChoice;
		if(h >= 125) {
			drawFlatRoof(rob, h);
		}else {
			drawPointyRoof(rob, h);
		}
		
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