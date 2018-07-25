package fr.agenceloc.model;

import java.util.Scanner;

public class RecetteMois extends MenuService{

	@Override
	public void executeUC(Scanner scanner, AgenceLocDao dao) {
		System.out.println("***Recette du Mois***");
		
		 dao.rechercheRecette();
		
		
	}

}
