package mx.drone.ui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.UIManager;

public class GUITestFrame extends JFrame {

	public GUITestFrame() {
		try {
			UIManager.setLookAndFeel(
			        UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setTitle("JConsole Recorder Demo");
		setSize(500, 600);
		setLocationByPlatform(true);
		getContentPane().add(GUI.build(null));
		setVisible(true);
	}

	public static void main(String[] args) {
		new GUITestFrame();
	}
	
}
