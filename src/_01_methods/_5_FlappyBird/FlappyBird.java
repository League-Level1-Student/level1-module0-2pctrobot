package _01_methods._5_FlappyBird;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int x = 750;
    int y = 300;
    int birdYVelocity = -10;
    int gravity = 1;
    int pipeMoveSpeed = -5;
    int upperPipeHeight = (int) random(100, 400);
    int the_gap = 100;

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        
    }

    @Override
    public void draw() {
    	background(0, 220, 255);
    	fill(255, 255, 0);
    	stroke(255, 255, 0);
    	ellipse(100, y, 25, 25);
    	fill(0, 255, 0);
    	stroke(0, 255, 0);
    	rect(x, 0, 50, upperPipeHeight);
    	x+=pipeMoveSpeed;
    	y+=birdYVelocity;
    	birdYVelocity+=gravity;
    	if(mousePressed) {
    		birdYVelocity=-10;
    	}
    }

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
