package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot k2so=new Robot();
k2so.sparkle();
	k2so.getY();
	k2so.getX();
	k2so.penDown();
	k2so.setPenColor(Color.ORANGE);
	for(int i=0;i<4;i++){
	k2so.move(500);
	k2so.turn(90);
	
	
	
	}
}
}