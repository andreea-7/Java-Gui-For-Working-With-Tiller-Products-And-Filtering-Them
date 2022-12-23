package GUI;

import javax.swing.*;

import my_proj.MotoSapa;

import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ActionListenerSave implements ActionListener {
	private JTextField filename;
	private JTextArea display;
	public static Object[] k = new MotoSapa[] {};

	public ActionListenerSave(JTextField filename, JTextArea display) {
		this.filename = filename;
		this.display = display;
	}

	public void actionPerformed(ActionEvent e) {
		ActionListenerSave.k = InterfataTest.motosape.toArray();

		for (Object i : ActionListenerSave.k) {
			System.out.println(i);
		}

		InterfataTest.motosape1 = InterfataTest.motosape;
		System.out.println("~~~~~~~~");

		// System.out.println(InterfataTest.motosape.toArray()[0]);
		String text = display.getText();
		try {
			File myObj = new File(filename.getText());
			myObj.createNewFile();
		} catch (IOException E1) {
			E1.printStackTrace();
		}

		try {
			FileWriter myWriter = new FileWriter(filename.getText());
			myWriter.write(text);
			myWriter.close();
		} catch (IOException E) {
			E.printStackTrace();
		}
	}
}
