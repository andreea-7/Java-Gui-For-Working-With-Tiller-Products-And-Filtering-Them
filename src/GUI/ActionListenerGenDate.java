package GUI;

import javax.swing.*;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import generatorMotosape.GeneratorMotosape;
import my_proj.MotoSapa;

public class ActionListenerGenDate implements ActionListener {

	private JTextField jtext;

	public ActionListenerGenDate(JTextField jtext) {
		this.jtext = jtext;
	}

	public void actionPerformed(ActionEvent e) {
ActionListenerLoad.ok=false;
		InterfataTest.display.selectAll();
		InterfataTest.display.replaceSelection("");
		try
		{
			InterfataTest.motosape = GeneratorMotosape.genMotosape(Integer.parseInt(jtext.getText()));
		} catch(NumberFormatException E)
		{
			GenericErrorFrame obj=new GenericErrorFrame("Ai introdus un numar invalid de motosape de generat!");
		}
		// ActionListenerLoad.ok=false;
		for (MotoSapa a : InterfataTest.motosape) {
			InterfataTest.display.append(a + "\n");
		}
	}

}
