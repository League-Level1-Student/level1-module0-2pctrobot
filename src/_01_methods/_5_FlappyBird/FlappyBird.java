 package _01_methods._5_FlappyBird;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int x = 750;
    int y = 300;
    int birdX = 100;
    int birdYVelocity = -10;
    int gravity = 1;
    int pipeMoveSpeed = -5;
    int upperPipeHeight = (int) random(100, 400);
    int the_gap = 200;
    int lowerY = upperPipeHeight + the_gap;
    int pipeWidth = 50;
    int score = 0;

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
    	ellipse(birdX, y, 25, 25);
    	fill(0, 255, 0);
    	stroke(0, 255, 0);
    	rect(x, 0, pipeWidth, upperPipeHeight);
    	rect(x, lowerY, pipeWidth, 700);
    	fill(59, 33, 0);
    	stroke(59, 33, 0);
    	rect(0,600,800,-10);
    	intersectsPipes();
    	intersectGround();
    	fill(0,0,0);
    	text("Score: "+score, 20, 20);
    	x+=pipeMoveSpeed;
    	y+=birdYVelocity;
    	birdYVelocity+=gravity;
    	if(mousePressed) {
    		birdYVelocity=-10;
    	}
    	if(x<=0-pipeWidth) {
    		x=750;
    		upperPipeHeight = (int) random(100, 400);
    		lowerY = upperPipeHeight + the_gap;
    	}
    }

    private void intersectGround() {
		if(y>=600) {
			println("Your score was: " + score);
			exit();
		}
	}

	static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
    void intersectsPipes() { 
        if (y < upperPipeHeight && birdX > x && birdX < (x+pipeWidth)){
            println("Your score was: " + score);
            exit(); }
       else if (y > lowerY && birdX > x && birdX < (x+pipeWidth)) {
    	    println("Your score was: " + score);
    	    exit(); }
       else if(x==100) {
    	   score+=1;
       }
}
}
