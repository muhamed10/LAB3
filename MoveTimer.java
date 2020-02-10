package LAB3;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MoveTimer extends Timer {
	private Updater _updater;
	
	public MoveTimer(int anInterval, Updater aUpdate) {
		super(anInterval, null);
		_updater = aUpdate;
		this.addActionListener(new MoveListener());
	}
	
	private class MoveListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			_updater.update();
		}
	}
}