package vehicule;

public class Voiture {
	//proprietés
	private int id;
	private String marque;
	private double vitesse;
	private int puissance;
	private static int count;

	//constructeurs
	public Voiture(){
		marque = "";
		vitesse = 00.0;
		puissance = 0;
		
	}
	public Voiture(String cMarque, double cVitesse, int cPuissance){
		id = ++count;
		marque = cMarque;
		vitesse = cVitesse;
		puissance = cPuissance;
	}
	
	//accesseurs et getteurs
	public String getMarque(){
		return marque;
	}
	public void setMarque(String zMarque){
		marque = zMarque;
	}
	
	public int getId(){
		return id;
	}
	public void setId(){
		id = ++count;
	}
	
	public double getVitesse(){
		return vitesse;	
	}
	public void setVitesse(double zVitesse){
		vitesse = zVitesse;
	}
	public int getPuissance(){
		return puissance;
	}
	public void setPuissance(int zPuissance){
		puissance = zPuissance;
	}
	//méthode
	public String toString(){
		return this.getMarque() + this.getVitesse() + this.getPuissance(); 
	}
}
	