package LAB3;
import wheels.users.Frame;

public class GameBoard extends Frame {
	private final int INTERVAL = 50;
	private Ball _ball;
	private MoveTimer _timer;
	
	public GameBoard() {
		_ball = new Ball(100, 50);
		_timer = new MoveTimer(INTERVAL, _ball);
		_timer.start();
	}
	
	public static void main(String[] args) {
		new GameBoard();
	}
}
