package GUI;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneLayout;

import my_proj.MotoSapa;

import java.util.ArrayList;

public class genericFrame extends JFrame {

	public static JTextArea display;

	// parametrii: titlu, lista
	public genericFrame(ArrayList<MotoSapa> lista, String titlu) {
		JScrollPane scroll;

		display = new JTextArea();
		display.setBounds(20, 20, 250, 250);
		display.setVisible(true);
		display.setEditable(false);
		
		
		if(lista!=null)
		{
			for (MotoSapa a : lista) {
				display.append(a + "\n");
			}
		}

		scroll = new JScrollPane(display);
		scroll.setLayout(new ScrollPaneLayout());
		scroll.setVisible(true);
		scroll.setBounds(20, 20, 250, 250);

		add(scroll);
		setTitle(titlu);
		setSize(300, 300);
		setVisible(true);
		setResizable(false);
		setLayout(null);

	}

	public JTextArea getDisplay() {
		return display;
	}

}
