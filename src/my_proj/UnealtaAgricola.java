package my_proj;

public class UnealtaAgricola implements Aparat {
	
	public float getViteza() {
		return viteza;
	}

	public void setViteza(float viteza) {
		this.viteza = viteza;
	}

	public float getIntensitate() {
		return intensitate;
	}

	public void setIntensitate(float intensitate) {
		this.intensitate = intensitate;
	}

	public char getDirectie() {
		return directie;
	}

	public void setDirectie(char directie) {
		this.directie = directie;
	}

	public float getPutere() {
		return putere;
	}

	public void setPutere(float putere) {
		this.putere = putere;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public UnealtaAgricola()
	{
		this.viteza=0f;
		this.intensitate=0f;
		this.directie='N';
		this.putere=0f;
		this.marca="default";
	}
	
	public UnealtaAgricola(UnealtaAgricola un)
	{
		this.viteza=un.viteza;
		this.intensitate=un.intensitate;
		this.directie=un.directie;
		this.putere=un.putere;
		this.marca=un.marca;
		
	}
	public UnealtaAgricola(float viteza, float intensitate, char directie, float putere, String marca) {
		
		this.viteza=viteza;
		this.intensitate=intensitate;
		this.directie=directie;
		this.putere=putere;
		this.marca=marca;
		
	}
	
	public void taie()
	{
		System.out.println("Taie componentele plantelor");
	}
	
	public void alimenteaza()
	{
		System.out.println("Se alimenteaza cu benzina");
	}
	
	public 	String toString() {
		return "Unealta agricola de marca " + marca + " are viteza "+ viteza +", intensitatea "+
	intensitate+", directia "+ directie+" si puterea "+putere;
	}
	
	protected float viteza;
	protected float intensitate;
	protected char directie;
	protected float putere;
	protected String marca;

}
