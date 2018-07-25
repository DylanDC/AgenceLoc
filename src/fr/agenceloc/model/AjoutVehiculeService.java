package fr.agenceloc.model;

import java.util.Scanner;

public class AjoutVehiculeService extends MenuService {

	@Override
	public void executeUC(Scanner scanner, AgenceLocDao dao) {
		System.out.println("Ajout d'un nouveau vehicule");
		System.out.println("Veuillez saisir la marque");
		String vMarque = scanner.next();
		System.out.println("Veuillez saisir le model");
		String vModele= scanner.next();
		System.out.println("Veuillez saisir le Tarif journalier");
		double vTarif = scanner.nextDouble();
		System.out.println("Veuillez saisir le nombre de Vehicule du même type disponible");
		int vNbVehicule = scanner.nextInt();
		System.out.println("Veuillez saisir la durée de location");
		int vDureeLoc= scanner.nextInt();
		
		dao.saveNewVehicule(new TypesVehicules(vMarque, vModele, vTarif, vNbVehicule, vDureeLoc) {
			
			@Override
			String getType() {
				// TODO Auto-generated method stub
				return null;
			}
		});
			
		

			
			
			
		
	}

}
