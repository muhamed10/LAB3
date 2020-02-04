package LAB3;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MoveTimer extends Timer {
	private Mover _mover;
	
	public MoveTimer(int anInterval, Mover aMover) {
		super(anInterval, null);
		_mover = aMover;
		this.addActionListener(new MoveListener());
	}
	
	private class MoveListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			_mover.move();
		}
	}
}