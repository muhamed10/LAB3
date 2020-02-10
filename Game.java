package LAB3;

import wheels.users.Frame;
import java.util.*;


public class Game extends Frame implements Updater{
	
	private final int INTERVAL = 1;
	private MoveTimer _timer;
	private Ball _ball, _2ball;
	private Bat _bat;
	private Brick [][] _brick;
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
