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
	public Boolean intersect(Collision other)
	{
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
	}
	
	
	public Brick(int x, int y) {
		this.setColor(java.awt.Color.green);
		this.setSize(WIDTH, HEIGHT);
		this.setLocation(x, y);
	}
}