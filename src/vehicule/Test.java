package vehicule;

public class Test {

	public static void main(String[] args) {
		Voiture[] voitures= new Voiture[5];
		voitures[0]= new Voiture("BMW",220.0,8);
		voitures[1]= new Voiture("Ford",200.0,6);
		voitures[2]= new Voiture("Audi",240.0,8);
		voitures[3]= new Voiture("Renault",150.0,4);
		voitures[4]= new Voiture("Fiat",125.0,3);

		//voitures
		System.out.println(voitures[0].toString());

		for(Voiture v : voitures){
			System.out.println(v);
		}
		
		System.out.println("le nombre de voitures est "+ Voiture.count);
	}

}
