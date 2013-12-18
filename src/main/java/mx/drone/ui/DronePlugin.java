package mx.drone.ui;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.JPanel;
import javax.swing.SwingWorker;

import com.sun.tools.jconsole.JConsoleContext;
import com.sun.tools.jconsole.JConsoleContext.ConnectionState;
import com.sun.tools.jconsole.JConsolePlugin;


public class DronePlugin extends JConsolePlugin implements PropertyChangeListener {

	private Map<String, JPanel> tabs;

    private static final String TAB_NAME = "mx-drone";

    public DronePlugin() {
        addContextPropertyChangeListener(this);
    }

    @Override
    public synchronized Map<String, JPanel> getTabs() {
        if (tabs == null) {
        	tabs = new LinkedHashMap<>();
            tabs.put(TAB_NAME, GUI.build(getContext()));
        }
        return tabs;
    }

    @Override
    public SwingWorker<?,?> newSwingWorker() {
        return GUI.getSwingWorker();
    }

    @Override
    public void propertyChange(PropertyChangeEvent ev) {
    	GUI.onPropertyChange(ev);
    }
}
