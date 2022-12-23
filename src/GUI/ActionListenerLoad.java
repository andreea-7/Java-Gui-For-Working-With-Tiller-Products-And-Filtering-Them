package GUI;

import javax.swing.*;

import my_proj.MotoSapa;
import my_proj.UnealtaAgricola;

import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ActionListenerLoad implements ActionListener {

	public static boolean ok = false;

	public void actionPerformed(ActionEvent e) {
		InterfataTest.display.selectAll();
		InterfataTest.display.replaceSelection("");

		ok = true;
		// InterfataTest.motosape=ActionListenerSave.k;
		// ArrayList<MotoSapa> myList = ActionListenerSave.k as ArrayList<MotoSapa>;

		InterfataTest.motosape.clear();
		for (Object i : ActionListenerSave.k) {
			InterfataTest.motosape.add((MotoSapa) i);
		}

		ActionListenerSave.k = new MotoSapa[] {};
		try {
			File myObj = new File(InterfataTest.filename.getText());
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				InterfataTest.display.append(data + "\n");
				// append
			}
			myReader.close();
		} catch (FileNotFoundException E) {
			E.printStackTrace();
		}
	}

}
