package LAB3;
import wheels.users.Ellipse;
import java.awt.Toolkit;

public class Ball extends Ellipse implements Mover {
	public static final int DIAMETER = 30;
	
	public Ball(int x, int y) {
		super(java.awt.Color.red);
		this.setSize(DIAMETER, DIAMETER);
		this.setLocation(x, y);
	}
	
	public void move() {
		
		/*
		int x = this.getXLocation();
		int y = this.getYLocation();
		if (x < 650 && y < 450)
			this.setLocation(x + 5, y + 10);
		Toolkit.getDefaultToolkit().sync();
		*/
	}
}

