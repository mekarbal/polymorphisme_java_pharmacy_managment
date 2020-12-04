package app;

import java.util.ArrayList;
import java.util.Scanner;
import models.Client;
import models.Medication;
import models.Person;
import models.Pharmacist;

public class Main {

	public static void main(String[] args) {
		

	
		Scanner input = new Scanner(System.in);
		ArrayList<Medication> medications = new ArrayList<Medication>();
		ArrayList<Person> clients= new ArrayList<Person>();
		ArrayList<Person> pharmacists=new ArrayList<Person>();
		
		int out = 0;
		int back = 0;

		switch (prMenu()) {
		case 1:
			do {
				switch (crudMenu()) {

				case 1:
					int id = medications.size() + 1;
					System.out.println("Name :");
					String name = input.next();
					System.out.println("Description :");
					String description = input.next();
					System.out.println("Price :");
					String price = input.next();
					Medication medication =new Medication( id,  name,  description, price);
					medication.AddMedication(medications, medication);				
					System.out.println("Medicament  a ete bien ajouté");
					break;
				case 2:
					System.out.println(" tapez l\'id de medicament");
					id = input.nextInt();
					System.out.println("Name :");
					name = input.next();
					System.out.println("Description:");
					description = input.next();
					System.out.println("Price :");
					price = input.next();
					Medication upmedication =new Medication( id,  name,  description, price);
					upmedication.editMedication(medications, upmedication, id-1);
					System.out.println("la modification a ete bien fait");
					break;
				case 3:
					System.out.println(" tapez l\'id de medicament :");
					id = input.nextInt();
					Medication delmedication = new Medication();
					delmedication.deleteMedication(medications, id-1);
					System.out.println("Medicament a ete bien supprimé");
					break;
				case 4:
					System.out.println(medications);
					break;
				case 5:
					System.out.println("Search your medicament");
                    String searchMedication = input.next();
                  for (int i = 0; i < medications.size(); i++){
                      if(medications.get(i).getName().contains(searchMedication)){
                          System.out.println(medications.get(i).toString());
                      }
                  }
                  break;
				case 6:
					prMenu();

					break;
				default:
					System.out.println("Vous avez une erreur!!!!!!!!!!!!!");

				}
				;
			} while (back == 0);

			break;

		case 2:
			do {
				switch (crudMenu()) {

				case 1:
					int id = clients.size() + 1;
					System.out.println("First name:");
					String firstname = input.next();
					System.out.println("Last name :");
					String lastName = input.next();
					System.out.println("Phone :");
					String telephone = input.next();
					System.out.println("email :");
					String email = input.next();
					System.out.println("Badge :");
					int badge = input.nextInt();
					Client client = new Client( id, firstname,  lastName,  telephone,  email,  badge);
					System.out.println("Bien ajouté!");
					break;
				case 2:
					System.out.println(" Entrer un id  : ");
					id = input.nextInt();
					System.out.println("First name:");
					firstname = input.next();
					System.out.println("Last name :");
					lastName = input.next();
					System.out.println("Phone :");
					telephone = input.next();
					System.out.println("email :");
					email = input.next();
					System.out.println("Badge :");
					badge = input.nextInt();
					
					
					if(badge>=3) {
						System.out.println("ce client est fidéle");
					}
					System.out.println("bien modifier!");
					break;
				case 3:
					System.out.println("  Saisir un id  : ");
					id = input.nextInt();
					Client delClient = new Client();
					delClient.deletePerson(clients, id-1);
					System.out.println("Client deleted");
					break;
				case 4:
					System.out.println(clients);
					

					break;
				case 5:
					System.out.println("Search your Client");
                    String searchClient = input.next();
                  for (int i = 0; i < clients.size(); i++){
                      if(clients.get(i).getFirstname().contains(searchClient)){
                          System.out.println(clients.get(i).toString());
                      }
                  }
                  break;
				case 6:
					prMenu();

					break;
				default:
					System.out.println(" Vous avez une erreur !!! ");

				}
				;
			} while (back == 0);
			break;

		case 3:
			do {
				switch (crudMenu()) {

				case 1:
					int id = pharmacists.size() + 1;
					System.out.println("First name:");
					String firstname = input.next();
					System.out.println("Last name :");
					String lastName = input.next();
					System.out.println("Phone :");
					String telephone = input.next();
					System.out.println("email :");
					String email = input.next();					
					Pharmacist pharmacist = new Pharmacist(id, firstname,  lastName,  telephone,  email);
					pharmacist.addPerson(pharmacists, pharmacist);
					System.out.println("pharmacist added");
					
					break;
				case 2:
					System.out.println(" Entrer un id  : ");
					id = input.nextInt();
					System.out.println("First name:");
					firstname = input.next();
					System.out.println("Last name :");
					lastName = input.next();
					System.out.println("Phone :");
					telephone = input.next();
					System.out.println("email :");
					email = input.next();
					Pharmacist upPharmacist = new Pharmacist(id, firstname,  lastName,  telephone,  email  );
					upPharmacist.editPerson(pharmacists, upPharmacist, id-1);
					System.out.println("pharmacist updated");
					break;
				case 3:
					System.out.println(" Entrer un id  : ");
					id = input.nextInt();
					Pharmacist delPharmacist= new Pharmacist();
					delPharmacist.deletePerson(pharmacists, id-1);
					System.out.println(" pharmacist deleted");
					break;
				case 4:
					System.out.println(pharmacists+"\n");

					break;
				case 5:
					System.out.println("Search your Pharmacist");
                    String searchPharmacist = input.next();
                  for (int i = 0; i < pharmacists.size(); i++){
                      if(pharmacists.get(i).getFirstname().contains(searchPharmacist)){
                          System.out.println(pharmacists.get(i).toString());
                      }
                  }
                  break;
				case 6:
					prMenu();

					break;
				default:
					System.out.println(" Vous avez une erreur");

				}
				;
			} while (back == 0);
			break;
		case 4:
			System.exit(out);

			break;

		default:
			System.out.println(" Vous avez une erreur");

		}
		while (out == 0)
			;
		
	}
	
	public static int prMenu() {

		//int listSelec;
		Scanner liSele = new Scanner(System.in);

		System.out.println("Veuillez choisir un nombre");
		System.out.println("*****************************\n");
		System.out.println("1 - La gestion des Medicaments");
		System.out.println("2 - La gestion des Client");
		System.out.println("3 - La gestion des Pharmaciens");
		System.out.println("4 - Quitter");

		//listSelec = liSele.nextInt();
		return liSele.nextInt();

	}
	
	public static int crudMenu() {

		//int listSelec;
		Scanner liSele = new Scanner(System.in);

		System.out.println("Veuillez choisir un nombre");
		System.out.println("*****************************\n");
		System.out.println("1 - Ajouter");
		System.out.println("2 - Mise à jour");
		System.out.println("3 - Supprimer");
		System.out.println("4 - Afficher");
		System.out.println("5 - Search");
		System.out.println("6 - Retour");

		//listSelec = liSele.nextInt();
		return liSele.nextInt();

	}

}
