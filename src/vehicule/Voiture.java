package vehicule;

public class Voiture {
	//proprietés
	private int id;
	private String marque;
	private double vitesse;
	private int puissance;
	public static int count;

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
	//méthodes
	public String toString(){
		return "Voiture de marque "+this.getMarque()+" roule à une vitesse de "+this.getVitesse()+" km/h et délivre une puissance de "+this.getPuissance(); 
	}
}
	