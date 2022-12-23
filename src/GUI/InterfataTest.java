package GUI;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

import generatorMotosape.GeneratorMotosape;
import my_proj.MotoSapa;
import my_proj.UnealtaAgricola;

public class InterfataTest {

	public static ArrayList<MotoSapa> motosape = new ArrayList<MotoSapa>();
	public static ArrayList<MotoSapa> motosape1 = new ArrayList<MotoSapa>();
	public static ArrayList<MotoSapa> motosapeFiltrate;
	public static ArrayList<MotoSapa> motosapeFiltrate1;
	public static JTextArea display = new JTextArea(25, 50);
	public static JTextField filename;
	public static JTextField filename1;
	public static UnealtaAgricola[] unelte;

	InterfataTest() {
		JFrame frame = new JFrame();
		JScrollPane scroll;
		JLabel nrlabel;
		JLabel savelabel;
		JLabel nrlabel2;
		JScrollPane scroll1;

		JButton generator;
		JButton filterTais;
		JButton filterAdancime;
		JButton save;
		JButton load;

		JTextField tais1;
		JTextField tais2;
		JTextField adanc1;
		JTextField adanc2;

		display.setBounds(20, 20, 350, 250);
		display.setVisible(true);
		display.setEditable(false);

		scroll = new JScrollPane(display);
		scroll.setLayout(new ScrollPaneLayout());
		scroll.setVisible(true);
		scroll.setBounds(20, 20, 350, 250);

		nrlabel = new JLabel("Nr motosape:");
		nrlabel.setBounds(20, 290, 100, 30);

		JTextField nrTF = new JTextField(60);
		nrTF.setBounds(110, 290, 100, 30);

		generator = new JButton("Genereaza motosape");
		generator.setBounds(20, 340, 350, 40);
		generator.addActionListener(new ActionListenerGenDate(nrTF));

		tais1 = new JTextField();
		tais1.setBounds(20, 390, 40, 30);

		tais2 = new JTextField();
		tais2.setBounds(270, 390, 40, 30);

		filterTais = new JButton("Filtreaza dupa tais");
		filterTais.setBounds(65, 390, 200, 40);
		filterTais.addActionListener(new ActionListenerFiltrareTais(tais1, tais2));

		adanc1 = new JTextField();
		adanc1.setBounds(20, 440, 40, 30);

		adanc2 = new JTextField();
		adanc2.setBounds(270, 440, 40, 30);

		filterAdancime = new JButton("Filtreaza dupa adancime");
		filterAdancime.setBounds(65, 440, 200, 40);
		filterAdancime.addActionListener(new ActionListenerFiltrareAdancime(adanc1, adanc2));

		filename = new JTextField();
		filename.setBounds(80, 490, 200, 30);

		MotoSapa obj = new MotoSapa();

		save = new JButton("Save motosape");
		save.setBounds(20, 540, 350, 40);
		save.addActionListener(new ActionListenerSave(filename, display));

		savelabel = new JLabel("Save as: ");
		savelabel.setBounds(20, 490, 100, 30);

		load = new JButton("Load motosape");
		load.setBounds(20, 590, 350, 40);
		load.addActionListener(new ActionListenerLoad());

		frame.add(scroll);
		frame.add(nrTF);
		frame.add(nrlabel);
		frame.add(generator);
		frame.add(filterTais);
		frame.add(tais1);
		frame.add(tais2);
		frame.add(adanc1);
		frame.add(adanc2);
		frame.add(filterAdancime);
		frame.add(filename);
		frame.add(save);
		frame.add(savelabel);
		frame.add(load);

		frame.setLayout(null);
		frame.setSize(400, 800);
		frame.setTitle("Motosape");
		frame.setVisible(true);
		frame.setResizable(false);

	}

	public static void main(String[] args) {
		InterfataTest s = new InterfataTest();

	}
}
