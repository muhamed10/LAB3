package LAB3;
import wheels.users.Ellipse;
import java.awt.Toolkit;

public class Ball extends Ellipse implements Mover, Collision {
	public static final int DIAMETER = 30;
	public int xSpeed, ySpeed;
	
	public Ball(int x, int y) {
		super(java.awt.Color.red);
		this.setSize(DIAMETER, DIAMETER);
		this.setLocation(x, y);
		xSpeed = 5;
		ySpeed = 5;
	}
	
	public int getWidth()
	{
		return DIAMETER;
	}
	public int getHeigth()
	{
		return DIAMETER;
	}
	//Returnerar true ifall den korsar. OBS fungerar enbart för rektanglar 
	public boolean intersect(Collision other)
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
	
	public void move() {
		
		
		int x = this.getXLocation();
		int y = this.getYLocation();
		if (y > 450) {
			ySpeed = -ySpeed;
		}
		else if(y < 0)
		{
			ySpeed = -ySpeed;
		}
		else if (x < 0)
			xSpeed = -xSpeed;
		else if (x > 650)
			xSpeed = -xSpeed;
		
		this.setLocation(x + xSpeed, y + ySpeed);
		Toolkit.getDefaultToolkit().sync();
		
	}
}

