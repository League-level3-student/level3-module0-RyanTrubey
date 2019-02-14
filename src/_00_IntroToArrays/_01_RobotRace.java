package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		
	
	//2. create an array of 5 robots.
	Robot[] robots = new Robot[5];
	//3. use a for loop to initialize the robots.
	for(int i = 0; i < robots.length; i++) {
		robots[i] = new Robot();
		robots[i].setSpeed(10);
	}
	//4. make each robot start at the bottom of the screen, side by side, facing up
	int y = 20;
	for(int i = 0; i < robots.length; i++) {
		robots[i].turn(270);
		robots[i].miniaturize();
		robots[i].setY(y);
		robots[i].setX(725);
		y+=40;
	}
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
	boolean raceOver = false;
    	while(!raceOver) {
	for(int i = 0; i < robots.length; i++) {
    		Random r = new Random();
    		robots[i].move(r.nextInt(50));
    		if(robots[i].getX() <= 50) {
    			robots[i].turn(270);
    		}
    		if(robots[i].getX() >= 800 && robots[i].getY() >= 500) {
    			robots[i].turn(270);
    		}
    		if(robots[i].getY() <= 0) {
    			JOptionPane.showMessageDialog(null, "Robot " + (i+1) + " won the race");
    			robots[i].setX(500);
    			robots[i].setY(300);
    			robots[i].turn(360);
    			raceOver = true;
    			break;
    		}
    	}
    	}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
   
	//7. declare that robot the winner and throw it a party!
    
	//8. try different races with different amounts of robots.
	
	//9. make the robots race around a circular track.

	}
}
