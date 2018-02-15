import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class ValentinesCard {
	public static void main(String[] args) {
		Robot.setWindowImage("Hearts.JPG");
		Robot tl = new Robot();
		tl.setX(700);
		tl.setY(100);
		
		Robot tr = new Robot();
		
		tr.setX(700);
		tr.setY(100);
		drawHeartSmall(tr,tl);
		
		Robot r = new Robot();
		Robot l = new Robot();
		setup(l);
		
		setup(r);
		r.setPenColor(Color.red);
		drawHeart(r, l);

		l.setX(100);
		l.setY(400);
		l.setAngle(0);
		l.setPenColor(Color.black);
		for (int i = 0; i < 2; i++) {

			l.move(40);
			l.turn(-90);
			l.move(20);
			l.turn(180);
			l.move(40);
			l.turn(180);
			l.move(20);
			l.turn(-90);
		}

		r.setX(730);
		r.setY(400);
		r.setAngle(0);

		r.move(40);
		r.turn(180);
		r.setPenColor(Color.red);
		r.move(40);

		for (int i = 0; i < 180; i++) {

			r.move(1);
			r.turn(1);

		}
		r.move(40);

	}

	private static void drawHeart(Robot r, Robot l) {
		for (int i = 0; i < 190; i++) {

			r.move(1);
			r.turn(1);
			l.move(1);
			l.turn(-1);
		}
		l.setPenColor(Color.red);
		r.setPenColor(Color.black);
		l.turn(-20);
		l.move(275);
		r.turn(10);
		r.move(250);
	}

	private static void drawHeartSmall(Robot tr, Robot tl) {
		for (int i = 0; i < 220; i++) {
			tr.penDown();
			tl.penDown();
			tr.hide();
			tl.hide();
			tr.move(1);
			tr.turn(1);
			tl.move(1);
			tl.turn(-1);
		}
		tl.setPenColor(Color.red);
		tr.setPenColor(Color.black);

		tl.move(150);

		tr.move(150);
	}

	private static void setup(Robot l) {
		l.penDown();
		l.hide();
		l.setPenWidth(20);
		l.setSpeed(100);
	}
}
