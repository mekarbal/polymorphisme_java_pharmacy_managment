package app;

import java.util.ArrayList;

import java.util.Scanner;

import models.Client;
import models.Medication;
import models.Person;
import models.Pharmacist;
import traitements.Traitement;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;





public class Main {
	
	

public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<Medication> medications = new ArrayList<Medication>();
		ArrayList<Person> clients= new ArrayList<Person>();
		ArrayList<Person> pharmacists=new ArrayList<Person>();
		
		Traitement tr= new Traitement();
		
	while(true){
		

		System.out.println("Veuillez choisir un nombre");
		System.out.println("*****************************\n");
		System.out.println("1 - La gestion des Medicaments");
		System.out.println("2 - La gestion des Clients");
		System.out.println("3 - La gestion des Pharmaciens");
		System.out.println("4 - Quitter");
	    
	    int choice = input.nextInt();
	    
	    switch(choice){
	        case 1:
	   
	        		int choice1 = tr.crudMenu() ;
	        		switch(choice1) {
	        		case 1 :
	        			int id = medications.size() + 1;
						System.out.println("Nom de medicament :");
						String name = input.next();
						System.out.println("Description :");
						String description = input.next();
						System.out.println("Prix (DH) :");
						String price = input.next();
						Medication medication =new Medication( id,  name,  description, price);
						medication.AddMedication(medications, medication);				
						System.out.println("Medicament  a été bien ajouté");
	        			break;
	        		case 2:
						System.out.println(" Tapez l\'id de medicament");
						id = input.nextInt();
						System.out.println("Nom de medicament :");
						name = input.next();
						System.out.println("Description:");
						description = input.next();
						System.out.println("Prix (DH) :");
						price = input.next();
						Medication upmedication =new Medication( id,  name,  description, price);
						upmedication.editMedication(medications, upmedication, id-1);
						System.out.println("la modification a été bien effectuée");
						break;
					case 3:
						System.out.println(" Tapez l\'id de medicament :");
						id = input.nextInt();
						Medication delmedication = new Medication();
						delmedication.deleteMedication(medications, id-1);
						System.out.println("Medicament a été bien supprimé");
						break;
					case 4:
						System.out.println(medications);
						break;
					case 5:
						System.out.println("Chercher un medicament par son nom :");
	                    String searchMedication = input.next();
	                  for (int i = 0; i < medications.size(); i++){
	                      if(medications.get(i).getName().contains(searchMedication)){
	                          System.out.println(medications.get(i).toString());
	                      }
	                  }
	                  break;
					case 6:
						System.out.println(choice1);
						break;
	        		case 7 : 
	        			break;
	        		default:
						System.out.println("Vous avez une erreur !!!!");
	        		}
	        		break;
	        	
	        	
	        case 2: 
	        	int choice2 = tr.crudMenu();
        		switch(choice2) {
        		case 1:
					int id = clients.size() + 1;
					System.out.println("Prénom :");
					String firstname = input.next();
					System.out.println("Nom :");
					String lastName = input.next();
					System.out.println("Numéro de téléphne :");
					String telephone = input.next();
					System.out.println("Email :");
					String email = input.next();
					System.out.println("Badge (nombre d'achat):");
					int badge = input.nextInt();
					Client client = new Client( id, firstname,  lastName,  telephone,  email,  badge);
					String badgeClient = badge >= 3 ? "Cette personne est un client fidéle" : "";
                    System.out.println(badgeClient);
					client.addPerson(clients, client);
					System.out.println("Client a ete bien ajouter");
					break;
				case 2:
					System.out.println(" Entrez un id  : ");
					id = input.nextInt();
					System.out.println("Prénom :");
					firstname = input.next();
					System.out.println("Nom :");
					lastName = input.next();
					System.out.println("Numéro de téléphne :");
					telephone = input.next();
					System.out.println("Email :");
					email = input.next();
					System.out.println("Badge (nombre d'achat):");
					badge = input.nextInt();
					Client upClient = new Client( id, firstname,  lastName,  telephone,  email,  badge);
					
					upClient.editPerson(clients, upClient, id);
					System.out.println("bien modifié!");
					break;
				case 3:
					System.out.println("  Saisir un id  : ");
					id = input.nextInt();
					Client delClient = new Client();
					delClient.deletePerson(clients, id-1);
					System.out.println("Client supprimé");
					break;
				case 4:
					Collections.sort(clients, tr.NameComparator );
					System.out.println(clients);
					

					break;
				case 5:
					System.out.println("Chercher un client");
                    String searchClient = input.next();
                  for (int i = 0; i < clients.size(); i++){
                      if(clients.get(i).getFirstname().contains(searchClient)){
                          System.out.println(clients.get(i).toString());
                      }
                  }
                  break;
				case 6:
					
					System.out.println(choice2);
					break;
        		case 7 : 
        			break;
        		default:
					System.out.println(" Vous avez une erreur !!! ");
        		}
        		break;
	        case 3: 
	        	int choice3 = tr.crudMenu();
        		switch(choice3) {
        		case 1:
					int id = pharmacists.size() + 1;
					System.out.println("Prénom :");
					String firstname = input.next();
					System.out.println("Nom :");
					String lastName = input.next();
					System.out.println("Numéro de téléphone :");
					String telephone = input.next();
					System.out.println("Email :");
					String email = input.next();					
					Pharmacist pharmacist = new Pharmacist(id, firstname,  lastName,  telephone,  email);
					pharmacist.addPerson(pharmacists, pharmacist);
					System.out.println("Pharmacien ajoutée avec succes");
					
					break;
				case 2:
					System.out.println(" Entrez un id  : ");
					id = input.nextInt();
					System.out.println("Prénom :");
					firstname = input.next();
					System.out.println("Nom :");
					lastName = input.next();
					System.out.println("Numéro de téléphone :");
					telephone = input.next();
					System.out.println("Email :");
					email = input.next();
					Pharmacist upPharmacist = new Pharmacist(id, firstname,  lastName,  telephone,  email  );
					upPharmacist.editPerson(pharmacists, upPharmacist, id-1);
					System.out.println("Pharmacien modifié avec succes");
					break;
				case 3:
					System.out.println(" Entrer un id  : ");
					id = input.nextInt();
					Pharmacist delPharmacist= new Pharmacist();
					delPharmacist.deletePerson(pharmacists, id-1);
					System.out.println("Pharmacien supprimé");
					break;
				case 4:
					System.out.println(pharmacists+"\n");

					break;
				case 5:
					System.out.println("Charcher un pharmacien");
                    String searchPharmacist = input.next();
                  for (int i = 0; i < pharmacists.size(); i++){
                      if(pharmacists.get(i).getFirstname().contains(searchPharmacist)){
                          System.out.println(pharmacists.get(i).toString());
                      }
                  }
                  break;
				case 6:
					System.out.println(tr.calcul());
					break;
				case 7:
					break;
				default:
					System.out.println(" Vous avez une erreur");

        		
        		}
	        	break;
	        case 4: 
	        
	        	break;
	        default:
				System.out.println(" Vous avez une erreur");
	     
	       
	    }
	    }

	}
	
	
}
