package LAB3;

public class Shell implements Collision{
	int _x, _y, _width, _heigth;

	public Shell(int x, int y, int width, int heigth)
	{
		_x = x;
		_y = y;
		_width = width;
		_heigth = heigth;
	}
	
	public int getHeigth()
	{
		return _heigth;
	}
	public int getWidth()
	{
		return _width;
	}
	public int getXLocation()
	{
		return _x;
	}
	public int getYLocation()
	{
		return _y;
	}
	
	public Direction intersect(Collision object)
	{
		return Direction.None;
	}
	
}
