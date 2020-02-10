package LAB3;

import wheels.users.Frame;
import java.util.*;


public class Game extends Frame implements Updater{

	private final int INTERVAL = 50;
	private MoveTimer _timer;
	private Ball _ball, _2ball;
	private Bat _bat;
	private Brick [][] _brick;
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
		_2ball.move();
		if (_ball.intersect(_brick))
		{
			_ball.xSpeed = -_ball.xSpeed;
		}
	}

}