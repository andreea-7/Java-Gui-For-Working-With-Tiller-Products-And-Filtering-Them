package generatorMotosape;
import java.util.ArrayList;
import java.util.Random;
import my_proj.MotoSapa;
public class GeneratorMotosape {
/*
 	private float adancime;
	private float taisul_sapei_mm;
	private float putere_brat_sapa;
	private float directie_brat_sapa;
	private float forta_sapa;
 */
	
	static protected float[] viteze=new float[] {5f, 12f, 17f, 20f, 25f};
	static protected float[] intensitati=new float[] {10f, 15f, 23f, 30f, 36f};
	static protected char[] directii=new char[] {'N', 'S', 'E', 'V'};
	static protected float[] puteri=new float[] {25f, 32f, 38f, 45f, 50f};
	static protected String[] marci=new String[] {"Reese", "Lions's", "McGarphy", "Wondersess", "Murabulius"};
	
	static protected float[] adancimi=new float[] {5f,7f,11f,14f,20f};
	static protected float[] taisuri_sapa_mm=new float[] {2f,5f,7f,10f};
	static protected float[] puteri_brat_sapa=new float[] {25f, 33f, 40f, 48f, 60f};
	static protected float[] directii_brat_sapa=new float[] {0f,1f,2f,3f};
    static protected float[] forte_sapa=new float[] {30f, 38f, 42f, 50f, 55f};
    
    public static ArrayList<MotoSapa> genMotosape(int n)
    {
    	ArrayList<MotoSapa> array_motosape = new ArrayList();
    	
    	for(int i=0;i<n;i++)
    	{
    	float viteza1=viteze[new Random().nextInt(viteze.length)];
		float intensitate1=intensitati[new Random().nextInt(intensitati.length)];
		char directie1=directii[new Random().nextInt(directii.length)];
		float putere1=puteri[new Random().nextInt(puteri.length)];
		String marca1=marci[new Random().nextInt(marci.length)];
		
		float adancime1=adancimi[new Random().nextInt(adancimi.length)];
		float tais_sapa_mm1=taisuri_sapa_mm[new Random().nextInt(taisuri_sapa_mm.length)];
		float putere_brat_sapa1=puteri_brat_sapa[new Random().nextInt(puteri_brat_sapa.length)];
		float directie_brat_sapa1=directii_brat_sapa[new Random().nextInt(directii_brat_sapa.length)];
		float forta_sapa1=forte_sapa[new Random().nextInt(forte_sapa.length)];
		
		MotoSapa motosapa=new MotoSapa(viteza1, intensitate1, directie1, putere1, marca1,adancime1,tais_sapa_mm1, 
				putere_brat_sapa1, directie_brat_sapa1,
				forta_sapa1);
		array_motosape.add(motosapa);
		
    	}
		
		return array_motosape;
    }
}
