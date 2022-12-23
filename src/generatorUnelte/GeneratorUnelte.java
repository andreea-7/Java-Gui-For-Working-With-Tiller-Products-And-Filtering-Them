package generatorUnelte;

import java.util.Random;
import my_proj.UnealtaAgricola;
public class GeneratorUnelte {
/*
  protected float viteza;
	protected float intensitate;
	protected char directie;
	protected float putere;
	protected String marca;
 */
static protected float[] viteze=new float[] {5f, 12f, 17f, 20f, 25f};
static protected float[] intensitati=new float[] {10f, 15f, 23f, 30f, 36f};
static protected char[] directii=new char[] {'N', 'S', 'E', 'V'};
static protected float[] puteri=new float[] {25f, 32f, 38f, 45f, 50f};
static protected String[] marci=new String[] {"Reese", "Lions's", "McGarphy", "Wondersess", "Murabulius"};

public static UnealtaAgricola[] genUnelte(int n)
{
	UnealtaAgricola[] array_unelte = new UnealtaAgricola[n];
	for(int i=0;i<n;i++)
	{
		float viteza1=viteze[new Random().nextInt(viteze.length)];
		float intensitate1=intensitati[new Random().nextInt(intensitati.length)];
		char directie1=directii[new Random().nextInt(directii.length)];
		float putere1=puteri[new Random().nextInt(puteri.length)];
		String marca1=marci[new Random().nextInt(marci.length)];
		
		UnealtaAgricola unealta_agricola=new UnealtaAgricola(viteza1, intensitate1, directie1, putere1, marca1);
		array_unelte[i]=unealta_agricola;
	}
	return array_unelte;
}
}

