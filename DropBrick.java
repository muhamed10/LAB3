package LAB3;
import java.awt.event.MouseEvent;

public class DropBrick extends Brick {

	public DropBrick(int x, int y) {
		super(x, y);
	}
	
	public void mouseClicked(MouseEvent e) {
		this.setLocation(this.getXLocation(), 400);
	}
}