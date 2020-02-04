package LAB3;

import wheels.users.Rectangle;

public class Brick extends Rectangle {
	public static final int WIDTH = 50;
	public static final int HEIGHT = 25;
	
	public Brick(int x, int y) {
		this.setColor(java.awt.Color.green);
		this.setSize(WIDTH, HEIGHT);
		this.setLocation(x, y);
	}
}