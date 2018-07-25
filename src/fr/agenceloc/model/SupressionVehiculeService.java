package fr.agenceloc.model;

import java.util.Scanner;

public class SupressionVehiculeService extends MenuService {

	@Override
	public void executeUC(Scanner scanner, AgenceLocDao dao) {
		System.out.println("Veuillez choisir la marque du vehicule a supprimer :");
		String vMarque = scanner.next();
		System.out.println("Veuillez choisir le modele du vehicule a supprimer :");
		String vModele= scanner.next();
		
		dao.deleteVehicules(vMarque, vModele);
	}
	
}
