package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	int x = 100;
	Random rand = new Random();
	boolean winner = true;

	//2. create an array of 5 robots.
Robot[] sophiasukz = new Robot[5];
	//3. use a for loop to initialize the robots.
for (int i = 0; i < sophiasukz.length; i++) {
	
	sophiasukz[i] = new Robot("batman");
	sophiasukz[i].setY(600);
	sophiasukz[i].setX(x);
	x += 100;
	
}

		//4. make each robot start at the bottom of the screen, side by side, facing up
//done
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
while(true) {

for (int i = 0; i < sophiasukz.length; i++) {
	sophiasukz[i].setRandomPenColor();
	sophiasukz[i].setPenWidth(99480);
	sophiasukz[i].penDown();
	sophiasukz[i].move(rand.nextInt(300));

	if (sophiasukz[i].getY() < 10) {
		winner = false;
		System.out.println("robot" + i + "has won");
}

}	
}//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
//done

	//7. declare that robot the winner and throw it a party!
//done
	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.um
} 
}

