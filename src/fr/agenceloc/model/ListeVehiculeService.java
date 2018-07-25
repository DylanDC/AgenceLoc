package fr.agenceloc.model;

import java.util.ArrayList;
import java.util.Scanner;


public class ListeVehiculeService extends MenuService {

	@Override
	public void executeUC(Scanner scanner, AgenceLocDao dao) {
		// TODO Auto-generated method stub
		System.out.println("Liste des pizzas");

		ArrayList<TypesVehicules> vehicules = dao.findAllVehicules();
				System.out.println(vehicules);
	}

}
