package day3;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {


		// 1. Make a main method that includes all the steps below….
public static void main(String[] args) {
		// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"

Random r1=new Random();
int num = r1.nextInt(4); 
		// 3. Print out this variable

		// 4. Get the user to enter a question for the 8 ball
JOptionPane.showInputDialog( "enter your question");
		// 5. If the random number is 0
if (num==0){
		// -- tell the user "Yes"
System.out.println("yes");
}
		// 6. If the random number is 1
if (num==1){
		// -- tell the user "No"
	System.out.println("no");
	}
		// 7. If the random number is 2
if (num==2){
		// -- tell the user "Maybe you should ask Google?"
	System.out.println("Maybe you should ask Google?");
	}
		// 8. If the random number is 3
if (num==3){
		// -- write your own answer
	System.out.println("stop shakeing the ball and get a life.");
	}

}
}


