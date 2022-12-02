package JFrame;

public class Produit {
	private int id;
	private String Libelle;
	private double prix;
	

	public Produit() {
		// TODO Auto-generated constructor stub
	}
	
	public Produit(int i, String l, double p) {
		id=i; 
		Libelle=l; 
		prix=p;
	}
	
	public Produit(String l, double p) {
		Libelle=l; 
		prix=p;
	}
	public int getId() {
		return id;
	}
	public String getLibelle() {
		return Libelle;
	}
	
	public double getPrix() {
	return prix;
	}
	
	public void setId(int i) {
		id=i;
	}
	public void setLibelle(String l) {
		Libelle=l;
	}

	public void setPrix(double p) {
		prix=p;
	}
	public String toString() {
		String x;
		x= "le produit d'id : "+id+" intitulé :"+Libelle+" a prix : "+prix;
		return x;
	}
}
