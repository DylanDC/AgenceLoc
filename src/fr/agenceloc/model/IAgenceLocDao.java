package fr.agenceloc.model;

import java.util.ArrayList;

public interface IAgenceLocDao {
	ArrayList<TypesVehicules> findAllVehicules();
	
	void saveNewVehicule(TypesVehicules vehicules);
	
	void updateVehicules(String marques, String modele, TypesVehicules vehicules );
	
	void deleteVehicules(String marques, String modele);
	
	void rechercheRecette();
	//void ajoutDureeLoc(String marque, String modele,TypesVehicules vehicules);
	
	TypesVehicules findVehicules(String marque, String modele );
	
	
	
	boolean vehiculeExists(String marque,String modele);

	

	

}
