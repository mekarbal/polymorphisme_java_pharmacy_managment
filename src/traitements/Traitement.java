package traitements;

import java.util.Comparator;
import java.util.Scanner;

import models.Person;

public class Traitement {
	
	
	public static int crudMenu() {

		//int listSelec;
		Scanner liSele = new Scanner(System.in);

		System.out.println("Veuillez choisir un nombre");
		System.out.println("*****************************\n");
		System.out.println("1 - Ajouter");
		System.out.println("2 - Modifier");
		System.out.println("3 - Supprimer");
		System.out.println("4 - Afficher");
		System.out.println("5 - Chercher");
		System.out.println("6 - Calculer le chiffre d\'affire");
		System.out.println("7 - Retour");

		//listSelec = liSele.nextInt();
		return liSele.nextInt();

	}
	
	
	public static int calcul() {
		Scanner input = new Scanner(System.in);
		System.out.println("Prix :");
		String price = input.next();
		System.out.println("Quantité :");
		int Qty = input.nextInt();
		
		int sum = Integer.parseInt(price)*Qty;
	
		return sum;
		
	}
	
	public static Comparator<Person> NameComparator = new Comparator<Person>() {

        public int compare(Person c1, Person c2) {
           String clientName = c1.getFirstname();
           String clientLName = c2.getLastName();

           //ascending order
           return clientName.compareTo(clientLName);

        }

	
	};

}
