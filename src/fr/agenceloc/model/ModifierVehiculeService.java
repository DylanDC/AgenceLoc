package fr.agenceloc.model;

import java.util.ArrayList;

import java.util.Scanner;

public class ModifierVehiculeService extends MenuService {

	@Override
	public void executeUC(Scanner scanner, AgenceLocDao dao) {
		
		
		
		System.out.println("Mise à jour d’un Vehicule");
		ArrayList <TypesVehicules> vehicules = dao.findAllVehicules();
		for (int i = 0;i<vehicules.size();i++){
			
				System.out.println(vehicules.get(i));	
			
		}

		
		System.out.println("Veuillez choisir la marque du vehicules a modifier ! ");
		String vMarque = scanner.next();
		System.out.println("Veuillez choisir le types du vehicules a modifier ! ");
		String vModele = scanner.next();
		
		
		System.out.println("Veuillez saisir la nouvelle marque du vehicule (sans espace)");
		String newMarque = scanner.next();
		System.out.println("Veuillez saisir le nouveau modele du vehicule");
		String newModele = scanner.next();
		System.out.println("Veuillez saisir le nouveau tarif journalier du vehicule");
		Double newTarif = scanner.nextDouble();
		
		System.out.println("Veuillez saisir le nombre de vehicules");
		int newNbVehicules = scanner.nextInt();
		System.out.println("Veuillez saisir la durée de location");
		int newDureeLoc = scanner.nextInt();
		System.out.println("Veuillez saisir le m3 (pour une voiture mettre \"0\" ");
		int newVolume = scanner.nextInt();
		
		//verification si m3 = camion, sinon = voiture
		if (newVolume !=0){
		dao.updateVehicules(vMarque, vModele, new Voitures(newMarque,newModele,newTarif,newNbVehicules,newDureeLoc) );
		}
		else {
			dao.updateVehicules(vMarque, vModele,new Camions(newMarque,newModele,newTarif,newNbVehicules,newDureeLoc,newVolume));
			
		}
	}
		
	}


