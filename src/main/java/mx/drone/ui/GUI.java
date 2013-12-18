package mx.drone.ui;

import java.beans.PropertyChangeEvent;

import javax.swing.JPanel;
import javax.swing.SwingWorker;

import com.sun.tools.jconsole.JConsoleContext;

public class GUI {
	
	private static JConsoleContext ctx;
	
	static JPanel build(JConsoleContext ctx) {
		GUI.ctx = ctx;
		
		return new JPanel();
	}
	
	static void onPropertyChange(PropertyChangeEvent ev) {
		// noop for now
	}
	
	static SwingWorker<?,?> getSwingWorker() {
		return new SwingWorker<Object, Object>() {

			@Override
			protected Object doInBackground() throws Exception {
				return null;
			}
		
		};
	}

}
