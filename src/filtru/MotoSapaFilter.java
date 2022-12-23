package filtru;

import java.util.ArrayList;
import java.util.Random;

import my_proj.MotoSapa;


public class MotoSapaFilter {

	
	public static ArrayList<MotoSapa> filtreazaDupaTaisulSapei(ArrayList<MotoSapa> init_list_motosape, float taisMin, float taisMax) {
		ArrayList<MotoSapa> lista_motosape = new ArrayList();
		for(MotoSapa motosapa:init_list_motosape)
			if (motosapa.getTaisul_sapei_mm()<=taisMax && motosapa.getTaisul_sapei_mm()>=taisMin)
					lista_motosape.add(motosapa);				
		return lista_motosape;
	}
	
	
	public static ArrayList<MotoSapa> filtreazaDupaAdancime(ArrayList<MotoSapa> init_list_motosape, float adancimeMin, float adancimeMax) {
		ArrayList<MotoSapa> lista_motosape = new ArrayList();
		for(MotoSapa motosapa:init_list_motosape)
			if (motosapa.getAdancime()<=adancimeMax && motosapa.getAdancime()>=adancimeMin)
					lista_motosape.add(motosapa);				
		return lista_motosape;
	}

	
	
}
