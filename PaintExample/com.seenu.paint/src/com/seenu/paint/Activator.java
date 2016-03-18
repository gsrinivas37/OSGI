package com.seenu.paint;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.seenu.shape.circle.Circle;
import com.seenu.shape.square.Square;
import com.seenu.shape.triangle.Triangle;

public class Activator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
	    SwingUtilities.invokeAndWait(new Runnable() {
	      public void run() {
	        PaintFrame frame = new PaintFrame();
	        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	        frame.addWindowListener(new WindowAdapter() {
	          public void windowClosing(WindowEvent evt) {
	            System.exit(0);
	          }
	        });
	        frame.addShape(new Circle());
	        frame.addShape(new Square());
	        frame.addShape(new Triangle());
	        frame.setVisible(true);
	      }
	    });
	  
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
	}

}
