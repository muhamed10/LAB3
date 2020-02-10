package LAB3;
import java.awt.event.MouseEvent;

public class DropBrick extends Brick {

	public static final int WIDTH = 50;
	public static final int HEIGHT = 25;
	
	public DropBrick(int x, int y) {
		super(x, y);
	}

	
	public void mouseClicked(MouseEvent e) {
		this.setLocation(this.getXLocation(), 400);

	}
}