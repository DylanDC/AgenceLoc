package fr.agenceloc.model;

public class Voitures extends TypesVehicules{

	public Voitures(String type, String marque, String modele, double prixJour, int nbVehicule, int dureeLoc) {
		super(type, marque, modele, prixJour, nbVehicule, dureeLoc);
		// TODO Auto-generated constructor stub
	}

	@Override
	String getType() {
		// TODO Auto-generated method stub
		return "Voiture";
	}

}
