package fr.agenceloc.administartion;

import java.util.Scanner;

import fr.agenceloc.model.AgenceLocDao;
import fr.agenceloc.model.AjoutVehiculeService;
import fr.agenceloc.model.ListeVehiculeService;
import fr.agenceloc.model.ModifierVehiculeService;
import fr.agenceloc.model.RecetteMois;
import fr.agenceloc.model.SupressionVehiculeService;

public class AgenceLocAdministration {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		AgenceLocDao dao = new AgenceLocDao();
		int choix = 0;
		
	
		
		do{
			System.out.println("*************Administration**************");
			System.out.println("1.LISTE DES VEHICULE" );
			System.out.println("2.AJOUT VEHICULE");
			System.out.println("3.MODIFIER VEHICULE");
			System.out.println("4.SUPRIMER VEHICULE");
			System.out.println("5.AJOUT DUREE DE LOCATION");
			System.out.println("6.AFFICHER RECETTE");
			System.out.println("0.QUITTER L'INTERFACE");
			
			choix = scanner.nextInt();
			
			switch(choix){
			case 1:
				ListeVehiculeService listvehicule = new ListeVehiculeService();
				listvehicule.executeUC(scanner, dao);
				break;
			case 2:
				AjoutVehiculeService ajoutVehicule = new AjoutVehiculeService();
				ajoutVehicule.executeUC(scanner, dao);
				break;
			case 3:
				ModifierVehiculeService modifVehicule = new ModifierVehiculeService();
				modifVehicule.executeUC(scanner, dao);
				break;
			case 4:
				
				SupressionVehiculeService deleteVehicule=new SupressionVehiculeService();
				deleteVehicule.executeUC(scanner, dao);
				break;
			case 5:
				System.out.println("en construction :P");
				break;
			case 6:
				RecetteMois recette=new RecetteMois();
				recette.executeUC(scanner, dao);
				
				break;
			default:
				System.out.println("Aurevoir");
				break;
			}
			
			
		}while(choix!=0);
	}

}
