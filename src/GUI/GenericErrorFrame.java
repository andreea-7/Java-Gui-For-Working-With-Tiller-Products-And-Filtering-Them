package GUI;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneLayout;

public class GenericErrorFrame extends JFrame {

	private JTextArea display;
	public GenericErrorFrame(String message)
	{
		display = new JTextArea();
		display.setBounds(20, 20, 250, 250);
		display.setVisible(true);
		display.setEditable(false);
		
		{
			display.append(message);
		}
		JScrollPane scroll = new JScrollPane(display);
		scroll.setLayout(new ScrollPaneLayout());
		scroll.setVisible(true);
		scroll.setBounds(20, 20, 250, 250);

		add(scroll);
		
		setTitle("NumberFormatException!");
		setSize(300, 300);
		setVisible(true);
		setResizable(false);
		setLayout(null);
	}
}
