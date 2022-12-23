package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import filtru.MotoSapaFilter;
import my_proj.MotoSapa;

public class ActionListenerFiltrareAdancime implements ActionListener {

	private JTextField jtext1;
	private JTextField jtext2;
	public static genericFrame frame2;

	public ActionListenerFiltrareAdancime(JTextField jtext1, JTextField jtext2) {
		this.jtext1 = jtext1;
		this.jtext2 = jtext2;
	}

	public void actionPerformed(ActionEvent e) {

		if (ActionListenerLoad.ok == true) {
			InterfataTest.motosape = InterfataTest.motosape1;

		}
		try{
			InterfataTest.motosapeFiltrate1 = MotoSapaFilter.filtreazaDupaAdancime(InterfataTest.motosape,
		
				Integer.parseInt(jtext1.getText()), Integer.parseInt(jtext2.getText()));

		frame2 = new genericFrame(InterfataTest.motosapeFiltrate1, "Filtrare dupa adancime");
		} catch (NumberFormatException E) {
			GenericErrorFrame obj=new GenericErrorFrame("Ai introdus o adancime invalida!");
		}

	}
}
