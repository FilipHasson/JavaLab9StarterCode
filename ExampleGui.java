package example;

import javax.swing.*;
import java.awt.*;

public class ExampleGui extends JFrame
{
	public static final int WIDTH = 300;
	public static final int HEIGHT = 200;

	public ExampleGui()
	{
		//break this constructor up into methods for ease of editing

		super();

		setSize(WIDTH, HEIGHT);
		setTitle("A Silly Example");

		//setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

		/*add a menubar with 1 menu and 2 menu items to the content pane.  
		One menu item should exit.  The other should pop up a modal message box.*/

		//add a panel with an editable text area to the center of the content pane. 
		//Make sure the text area has scroll bars

		//add a panel with a non-editable text area in the east of the content pane

		/*add two buttons to the west area of the content pane. One should exit the program.
		One should copy the text from the center text area to the east area  You will need to use a layout manager*/

		pack();
	}
	/*Write at least two inner class listeners  that will do the work of this gui*/
	
	
	public static void main(String[] args)
	{
		ExampleGui thing = new ExampleGui();
		thing.setVisible(true);
	}
}