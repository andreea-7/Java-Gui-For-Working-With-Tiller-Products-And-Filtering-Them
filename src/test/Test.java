package test;



import java.util.ArrayList;
import java.util.Scanner;

import filtru.MotoSapaFilter;
import my_proj.MotoSapa;
import my_proj.UnealtaAgricola;
import generatorUnelte.GeneratorUnelte;
import generatorMotosape.GeneratorMotosape;

public class Test {
public static void main(String[] args)
{
	UnealtaAgricola[] unelte_agricole=GeneratorUnelte.genUnelte(10);
	for(UnealtaAgricola i:unelte_agricole)
		System.out.println(i);
	
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println();
	
	ArrayList<MotoSapa> motosape=GeneratorMotosape.genMotosape(10);
	
	for(MotoSapa i: motosape)
		System.out.println(i);
	
	System.out.println("-----------------------------------------------------------");
	
	Scanner scanner = new Scanner(System.in);
	
	float ad_min, ad_max, tais_min, tais_max;
	
	System.out.println("Adancime minima: ");
	ad_min = scanner.nextFloat();
	System.out.println("Adancime maxima: ");
	ad_max = scanner.nextFloat();
	
	ArrayList<MotoSapa> filter1=MotoSapaFilter.filtreazaDupaAdancime(motosape, ad_min, ad_max);
	
	
	System.out.println("dupa adancime");
	System.out.println();
	
	for (MotoSapa i: filter1)
	{
		System.out.println(i);
	}
	
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println();
	
	System.out.println("Tais minim: ");
	tais_min = scanner.nextFloat();
	System.out.println("Tais maxim: ");
	tais_max = scanner.nextFloat();
	
	
	ArrayList<MotoSapa> filter2=MotoSapaFilter.filtreazaDupaTaisulSapei(motosape, tais_min, tais_max);
	
	System.out.println("dupa taisul sapei");
	System.out.println();
	
	for (MotoSapa i: filter2)
	{
		System.out.println(i);
	}
	
	System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	
	
	
}
}
