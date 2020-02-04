package LAB3;
import java.awt.event.MouseEvent;

public class GoldBrick extends Brick {
	
	public GoldBrick(int x, int y) {
		super(x, y);
	}
	
	public void mouseClicked(MouseEvent e) {
		this.setColor(java.awt.Color.orange);
	}
}