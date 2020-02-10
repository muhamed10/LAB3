package LAB3;

import wheels.users.Rectangle;

public class Brick extends Rectangle implements Collision {
	public static final int WIDTH = 50;
	public static final int HEIGHT = 25;
	
	public int getWidth()
	{
		return WIDTH;
	}
	public int getHeigth()
	{
		return HEIGHT;
	}
	
	//Returnerar true ifall den korsar. OBS fungerar enbart för rektanglar 
	public Direction intersect(Collision other)
	{
		if (other.getWidth() + other.getXLocation() < this.getXLocation())
		{
			return Direction.None;
		}
		else if (this.getXLocation() + this.getWidth() < other.getXLocation())
		{
			return Direction.None;
		}
		else if (this.getYLocation() + this.getHeight() < other.getYLocation())
		{
			return Direction.None;
		}
		else if (other.getYLocation() + other.getHeigth() < this.getYLocation())
		{
			return Direction.None;
		}
		
		Direction yPot, xPot;
		
		if (other.getYLocation() < this.getYLocation())
		{
			yPot = Direction.Up;
			
		}
		
		return true;
	}
	
	
	public Brick(int x, int y) {
		this.setColor(java.awt.Color.green);
		this.setSize(WIDTH, HEIGHT);
		this.setLocation(x, y);
	}
}