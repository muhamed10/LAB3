package LAB3;

import wheels.users.Frame;
import java.util.*;


public class Game extends Frame implements Updater{

<<<<<<< HEAD
	private final int INTERVAL = 10;
=======
	private final int INTERVAL = 20;
>>>>>>> 13dc43d3d1cb4302a689b00ebbe3aedd2c71d410
	private MoveTimer _timer;
	private Ball _ball, _2ball;
	private Bat _bat;
	//private Brick [][] _brick;
	private Brick _brick;
	public Game()
	
	{
		
		_ball = new Ball(0,0);
		_2ball = new Ball(100, 100);
		_timer = new MoveTimer(INTERVAL, this);
		_timer.start();
		_bat = new Bat(300,450);
		for (int i=0;i<5;i++) {
			for (int j=0;j<3;j++) {
				
			}
		}
		_brick = new Brick(300, 300);
}

	public static void main(String[] args)
	{
		Game game = new Game();
		
	}

	public void update()
	{
		_ball.move();
		//_2ball.move();
		Direction d;
		d = _ball.intersect(_brick);
		if (d != Direction.None)
		{
<<<<<<< HEAD
			_ball.xSpeed = -_ball.xSpeed;
			_ball.ySpeed = -_ball.ySpeed;
=======
			if (d == Direction.Left || d == Direction.Right)
			{
				_ball.xSpeed = -_ball.xSpeed;
			}
			else
			{
				_ball.ySpeed = -_ball.ySpeed;
			}
		}
		
		d = _ball.intersect(_bat);
		if (d != Direction.None)
		{
			if (d == Direction.Left || d == Direction.Right)
			{
				_ball.xSpeed = -_ball.xSpeed;
			}
			else
			{
				_ball.ySpeed = -_ball.ySpeed;
			}
>>>>>>> 13dc43d3d1cb4302a689b00ebbe3aedd2c71d410
		}
	}

}