## PROJET AGENCE "LOCATION AUTOMOBILE"



#### Premier Commit [ Mise en place du Modele]

1. Création de l'architecture de base de l'application.
* abstract class TypesVehicules 
 * Camion extends TypesVehicules
 * Voiture extends TypesVehicules
 
#### Commit [Modification AgenceLoc] : 
1. Creation class AgenceLocAdministration
	* Ajout du menu "Basique" de la console "Admin"	

2. Creation d'une classe AgenceLocDao 

3. Creation d'une Interface AgenceLocDao

4. Creation de la classe MenuService
	* Ajout d'une classe abstract executeUC

5. Creation classe ListeVehiculeService
	* Herite de la class MenuService
	* Definition de la class executeUC pour ListeVehiculeService

6. Creation classe ModifierVehiculeService
	* Herite de la class MenuService
	* Definition de la class executeUC pour ModifierVehiculeService

7. Creation classe SupressionVehiculeService
	* Herite de la class MenuService
	* Definition de la class executeUC pour SupressionVehiculeService

8. Creation classe AjoutVehiculeService
	* Herite de la class MenuService
	* Definition de la class executeUC pour AjoutVehiculeService

9. Creation classe RecetteMois
	* Herite de la class MenuService
	* Definition de la class executeUC pour RecetteMois
