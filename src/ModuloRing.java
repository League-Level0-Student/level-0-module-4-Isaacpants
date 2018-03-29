import org.jointheleague.graphical.robot.Robot;

public class ModuloRing {
	// 1. Create a new Robot
	Robot r2d2 = new Robot();

	void go() {
		r2d2.hide();

		// 2. Move robot to 200, 300 (you may need to adjust this)
		// Hint: use moveTo or setX, setY
		r2d2.setX(200);
		r2d2.setY(450);
		// 3. Hide your robot (optional)
		r2d2.penDown();
		r2d2.setPenWidth(17);
		r2d2.setSpeed(10000);
		
		
		// 7. Do the following steps (8, 5, 6) 72 times
		for (int i = 0; i < 150; i++) {

			// 8. Use MODULO to set a new random pen color every 6 shapes
			if (i % 1 == 0) {
				r2d2.setRandomPenColor();
			}
			// 5. Call the drawShape method; choose the # sides for your shape
			drawShape(6);
			// 6. Move the robot 20 pixels, then turn 5 degrees
			r2d2.move(20);
			r2d2.turn(5);
		}
	}

	void drawShape(int numSides) {
		// 4. Write a for loop that will draw a shape with 'numSides' sides
		// Hint: turn 360/numSides
		for (int i = 0; i < numSides; i++) {
			r2d2.move(50);
			r2d2.turn(360 / numSides);

		}

	}

	public static void main(String[] args) {
		new ModuloRing().go();
	}
}
