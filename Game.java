package LAB3;

import wheels.users.Frame;
import java.util.*;


public class Game extends Frame implements Updater{
	
	private final int INTERVAL = 50;
	private MoveTimer _timer;
	private Ball _ball, _2ball;
	public Game()
	{
		_ball = new Ball(0,0);
		_2ball = new Ball(100, 100);
		_timer = new MoveTimer(INTERVAL, this);
		_timer.start();
	}
	
	public static void main(String[] args)
	{
		Game game = new Game();
	}

	public void Update()
	{
		_ball.move();
		_2ball.move();
	}
	
}
