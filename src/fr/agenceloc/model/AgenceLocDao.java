package fr.agenceloc.model;

import java.util.ArrayList;


public class AgenceLocDao implements IAgenceLocDao {
	private ArrayList<TypesVehicules> vehicules;
	
	
	public AgenceLocDao() {
		vehicules = new ArrayList<TypesVehicules>();
		vehicules.add(new Voitures("Peugeot","208",49,5,0));
		vehicules.add(new Voitures("Fiat","500",50,6,0));
		vehicules.add(new Voitures("Peugeot","208",58,3,0));
		vehicules.add(new Camions("Ford","Transit",74,8,0, 6));
		vehicules.add(new Camions("Mercedes","Sprinter",99,2,0, 0));
		vehicules.add(new Voitures("Volkswagen","Golf5",68,1,0));
		vehicules.add(new Voitures("Peugeot","307",52,3,0));
				
		}


	public ArrayList<TypesVehicules> findAllVehicules() {
		// TODO Auto-generated method stub
		return vehicules;
	}


	@Override
	public void saveNewvehicule(TypesVehicules vehicules) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateVehicules(String marque, String modele, TypesVehicules vehicules) {
		for (int i =0; i <this.vehicules.size();i++){
			TypesVehicules vehiculeModif= this.vehicules.get(i);
			vehiculeModif.setMarque(vehicules.getMarque());
			vehiculeModif.setModele(vehicules.getModele());
			vehiculeModif.setPrixJour(vehicules.getPrixJour());
			vehiculeModif.setNbVehicule(vehicules.getNbVehicule());
			vehiculeModif.setDureeLoc(vehicules.getDureeLoc());
			
			
		}
		
		
		
		
	}

	@Override
	public void deleteVehicules(String marques, String modele, TypesVehicules vehicules ) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public TypesVehicules findVehicules(String marque, String modele) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean vehiculeExists(String marque, String modele) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}
	
	 
	
	

