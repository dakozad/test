
//Adding more comments for testing
//Adding comment to test rebase
//this is a test

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ButtonListener implements ActionListener
{
	int count = 0;
	public void actionPerformed(ActionEvent e)
	{
	    System.out.println("Button pressed (" + count++ + ") " + 
			       e.getActionCommand());
	}
}

//Adding this to test for P2

//Adding another comment to test rebase
//hi there 
class ButtonCloser extends WindowAdapter
{
    public void windowClosing(WindowEvent we)
    {
	System.out.println("Application exiting");
	System.exit(0);
    }
}

//Testing Testing Testing
public class ButtonFrame extends JFrame
{
	public ButtonFrame()
	{
		JButton open = new JButton("Open");
		JButton close = new JButton("Close");
		ActionListener listener = new ButtonListener();

		open.addActionListener(listener);
		close.addActionListener(listener);

		Container pane = getContentPane();
		pane.setLayout(new FlowLayout());
		pane.add(open);
		pane.add(close);

		addWindowListener(new ButtonCloser());
		setSize(200, 100);
		setVisible(true); //testing git comments
	}

//P2 tests to see how git works
	public static void main(String args[])
	{
		JFrame f = new ButtonFrame(); //Checking how git works
	}
}
