## PROJET AGENCE "LOCATION AUTOMOBILE"

### Prelude 
L'objectif est de mettre a profit les différents modules de formation afin de creer un logiciel de gestion de location automobile.
Le logiciel sera mis a jour via différents commits et servira de projet file rouge tous au long de la formation DTA Java SE.
De plus j'implémenterai des aquis appris en autodidacte sur ce projet (Comme par exemple la mise en place d'une interface "Graphique").

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