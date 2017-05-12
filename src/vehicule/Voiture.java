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
}
	