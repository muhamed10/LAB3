package LAB3;

import wheels.users.Rectangle;
import java.awt.Point;
import java.awt.event.MouseEvent;
import wheels.users.*;

public class Bat extends Rectangle implements Collision {
	private Point _lastMousePosition;
	
	public Bat(int x, int y) {
		super(java.awt.Color.BLACK);
		_lastMousePosition = new Point();
		this.setSize(75, 15);
		this.setLocation(x, y);
		
	}
	
	public int getWidth()
	{
		return getSize().width;
	}
	
	public int getHeigth()
	{
		return getSize().height;
	}
	
	public void mousePressed(MouseEvent e) {
		_lastMousePosition = e.getPoint();
	}
	
	public void mouseDragged(MouseEvent e) {
		Point currentPoint = e.getPoint();
		int diffX = currentPoint.x - _lastMousePosition.x;
		this.setLocation(this.getXLocation() + diffX, this.getYLocation());
		_lastMousePosition = currentPoint;
	}
}