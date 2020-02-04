package LAB3;
import java.awt.event.MouseEvent;

public class HideBrick extends Brick {

	public HideBrick(int x, int y) {
		super(x, y);
	}
	
	public void mouseClicked(MouseEvent e) {
		this.hide();
	}
}