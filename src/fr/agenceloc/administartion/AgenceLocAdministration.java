package fr.agenceloc.administartion;

import java.util.Scanner;

import fr.agenceloc.model.AgenceLocDao;

public class AgenceLocAdministration {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		AgenceLocDao dao = new AgenceLocDao();
		int choix = 0;
		
	
		
		do{
			System.out.println("*************Administration**************");
			System.out.println("1.LISTE DES VEHICULE" );
			System.out.println("2.SUPRIMER VEHICULE");
			System.out.println("3.MODIFIER VEHICULE");
			System.out.println("4.AJOUT VEHICULE");
			System.out.println("5.RECHERCHE RECETTE D'UN MOIS");
			System.out.println("0.QUITTER L'INTERFACE");
			
			choix = sc.nextInt();
			
			switch(choix){
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			default:
				System.out.println("Aurevoir");
				break;
			}
			
			
		}while(choix!=0);
	}

}
