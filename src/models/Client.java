package models;

import java.util.ArrayList;

public class Client extends Person {

	private int badge;

	public Client(int id, String firstname, String lastName, String telephone, String email, int badge) {
		super(id, firstname, lastName, telephone, email);
		this.badge = badge;
	}

	public Client() {
	}

	

	public int getBadge() {
		return badge;
	}

	public void setBadge(int badge) {
		this.badge = badge;
	}


	
	
	@Override
	public String toString() {
		return "Client \n, Id=" + getId() + ", Pr�nom=" + getFirstname()
				+ ", Nom=" + getLastName() + ", T�l�phone=" + getTelephone() + ", Email="
				+ getEmail()+ " Badge=" + badge + "\n";
	}

	public String addPerson(ArrayList<Person> listPerson, Client client) {
		try {
			return super.addPerson(listPerson, client);
		} catch (Exception e) {
			return e.getMessage();
		}
	}
	
	

	public String editPerson(ArrayList<Person> listPerson, Client client, int index) {
		try {
			return super.editPerson(listPerson, client, index);
		} catch (Exception e) {
			return e.getMessage();
		}
	}
	
	public String deletePerson(ArrayList<Person> listPerson, int index) {
		try {
			return super.deletePerson(listPerson, index);
		} catch (Exception e) {
			return e.getMessage();
		}
	}
	
	@Override
	public String affichePerson(ArrayList<Person> listPerson) {
		try {
			return super.affichePerson(listPerson);
		} catch (Exception e) {
			return e.getMessage();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
