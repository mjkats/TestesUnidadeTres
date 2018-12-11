package lux;

import java.util.LinkedList;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JTextArea;


public class Systemm {
	
	public LinkedList ListOfUsers;
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void StartProgram() {
		  JFrame f = new JFrame("A JFrame");
	      f.setSize(480, 466);
	      f.setLocation(300,200);
	      f.getContentPane().add(BorderLayout.CENTER, new JTextArea(10, 40));
	      f.setVisible(true);
	}
}
