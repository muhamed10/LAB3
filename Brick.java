package LAB3;

import wheels.users.Rectangle;

public class Brick extends Rectangle implements Collision {
	public static final int WIDTH = 200;
	public static final int HEIGHT = 20;
	
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
		/*
		if (other.getWidth() + other.getXLocation() < this.getXLocation())
		{
			return false;
		}
		else if (this.getXLocation() + this.getWidth() < other.getXLocation())
		{
			return false;
		}
		else if (this.getYLocation() + this.getHeight() < other.getYLocation())
		{
			return false;
		}
		else if (other.getYLocation() + other.getHeigth() < this.getYLocation())
		{
			return false;
		}
		
		return true;
		*/
		return Direction.None;
	}
	
	
	public Brick(int x, int y) {
		this.setColor(java.awt.Color.green);
		this.setSize(WIDTH, HEIGHT);
		this.setLocation(x, y);
	}
}