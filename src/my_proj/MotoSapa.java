package my_proj;

public class MotoSapa extends UnealtaAgricola
{
	private float adancime;
	private float taisul_sapei_mm;
	private float putere_brat_sapa;
	private float directie_brat_sapa;
	private float forta_sapa;
	
	
	
	
	public MotoSapa(float viteza, float intensitate, char directie, float putere, String marca,float adancime, float taisul_sapei_mm, float putere_brat_sapa, float directie_brat_sapa,
			float forta_sapa) {
		super(viteza,intensitate,directie, putere, marca);
		this.adancime = adancime;
		this.taisul_sapei_mm = taisul_sapei_mm;
		this.putere_brat_sapa = putere_brat_sapa;
		this.directie_brat_sapa = directie_brat_sapa;
		this.forta_sapa = forta_sapa;
	}
	
	
	public MotoSapa() {
		super();
		this.adancime = 0f;
		this.taisul_sapei_mm = 0f;
		this.putere_brat_sapa = 0f;
		this.directie_brat_sapa = 0f;
		this.forta_sapa = 0f;
	}




	public float getAdancime() {
		return adancime;
	}




	public void setAdancime(float adancime) {
		this.adancime = adancime;
	}




	public float getTaisul_sapei_mm() {
		return taisul_sapei_mm;
	}




	public void setTaisul_sapei_mm(float taisul_sapei_mm) {
		this.taisul_sapei_mm = taisul_sapei_mm;
	}




	public float getPutere_brat_sapa() {
		return putere_brat_sapa;
	}




	public void setPutere_brat_sapa(float putere_brat_sapa) {
		this.putere_brat_sapa = putere_brat_sapa;
	}




	public float getDirectie_brat_sapa() {
		return directie_brat_sapa;
	}




	public void setDirectie_brat_sapa(float directie_brat_sapa) {
		this.directie_brat_sapa = directie_brat_sapa;
	}




	public float getForta_sapa() {
		return forta_sapa;
	}




	public void setForta_sapa(float forta_sapa) {
		this.forta_sapa = forta_sapa;
	}

	@Override
	public String toString() {
		return "MotoSapa [adancime=" + adancime + ", taisul_sapei_mm=" + taisul_sapei_mm + ", putere_brat_sapa="
				+ putere_brat_sapa + ", directie_brat_sapa=" + directie_brat_sapa + ", forta_sapa=" + forta_sapa + "]";
	}


	public MotoSapa(MotoSapa mot)
	{
		this.viteza=mot.viteza;
		this.intensitate=mot.intensitate;
		this.directie=mot.directie;
		this.putere=mot.putere;
		this.marca=mot.marca;
		
		this.adancime = mot.adancime;
		this.taisul_sapei_mm = mot.taisul_sapei_mm;
		this.putere_brat_sapa = mot.putere_brat_sapa;
		this.directie_brat_sapa = mot.directie_brat_sapa;
		this.forta_sapa = mot.forta_sapa;
	}

	public void taie()
	{
		System.out.println("Taie radacinile");
	}
}
