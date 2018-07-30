package fr.agenceloc.model;

import java.util.ArrayList;


public class AgenceLocDao implements IAgenceLocDao {
	private ArrayList<TypesVehicules> vehicules;


	public AgenceLocDao() {
		vehicules = new ArrayList<TypesVehicules>();
		vehicules.add(new Voitures("Peugeot","208",49,5,2));
		vehicules.add(new Voitures("Fiat","500",50,6,2));
		vehicules.add(new Voitures("Peugeot","208",58,3,2));
		vehicules.add(new Camions("Ford","Transit",74,8,2, 6));
		vehicules.add(new Camions("Mercedes","Sprinter",99,2,2, 20));
		vehicules.add(new Voitures("Volkswagen","Golf5",68,2,2));
		vehicules.add(new Voitures("Peugeot","307",52,2,2));

	}



	public ArrayList<TypesVehicules> findAllVehicules() {
		// TODO Auto-generated method stub
		return vehicules;
	}


	@Override
	public void saveNewVehicule(TypesVehicules vehicules) {
		this.vehicules.add(vehicules);

	}

	@Override
	public void updateVehicules(String marque, String modele,TypesVehicules vehicules) {
		for (int i =0; i <this.vehicules.size();i++){			
			if(this.vehicules.get(i).getMarque().equals(marque) && this.vehicules.get(i).getModele().equals(modele)){
				TypesVehicules vehiculeModif= this.vehicules.get(i);
				if (vehiculeModif.getType().equals("Camions")) {
					Camions camionModif = (Camions)vehiculeModif;
					camionModif.setVolumeM3(camionModif.getVolumeM3());
					vehiculeModif.setMarque(vehicules.getMarque());
					vehiculeModif.setModele(vehicules.getModele());
					vehiculeModif.setPrixJour(vehicules.getPrixJour());
					vehiculeModif.setNbVehicule(vehicules.getNbVehicule());
					vehiculeModif.setDureeLoc(vehicules.getDureeLoc());
				}
				else {
					vehiculeModif.setMarque(vehicules.getMarque());
					vehiculeModif.setModele(vehicules.getModele());
					vehiculeModif.setPrixJour(vehicules.getPrixJour());
					vehiculeModif.setNbVehicule(vehicules.getNbVehicule());
					vehiculeModif.setDureeLoc(vehicules.getDureeLoc());
				}
			}
		}



	}

	@Override
	public void deleteVehicules(String marque, String modele) {
		for (int i = 0; i<this.vehicules.size();i++) {
			if(this.vehicules.get(i).getMarque().equals(marque) && this.vehicules.get(i).getModele().equals(modele)){
				this.vehicules.remove(i);

			}
		}

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



	@Override
	public  void rechercheRecette() {
		double recetteGlobal=0;
		for (int i= 0;i<this.vehicules.size();i++) {
			
			double recetteVehicule=this.vehicules.get(i).getDureeLoc()*this.vehicules.get(i).getPrixJour();
			recetteGlobal +=recetteVehicule; 
			
		}
		System.out.println(recetteGlobal);


	}



	/*@Override
	public void ajoutDureeLoc(String marque, String modele, TypesVehicules vehicules) {
		for (int i =0; i <this.vehicules.size();i++){			
			if(this.vehicules.get(i).getMarque().equals(marque) && this.vehicules.get(i).getModele().equals(modele)){
				TypesVehicules locationModif= this.vehicules.get(i);
				locationModif.setDureeLoc(vehicules.getDureeLoc());
			}

		}




	 */






}	










