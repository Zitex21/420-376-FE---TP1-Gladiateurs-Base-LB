package jeugladiateurs;

import personnages.Personnage;
import combat.CompteurDeTour;
import combat.AffichageEcran;

public class JeuGladiateurs {

    public static void main(String[] args) {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Instanciation des objets">
    CompteurDeTour tour = new CompteurDeTour();
    AffichageEcran affichage = new AffichageEcran();
    Personnage personnage1 = new Personnage("Bob le malchanceux", 15, 15, 70, 15);
    Personnage personnage2 = new Personnage("Igore l'emplaleur", 25, 5, 100, 30);
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Affichage pré-combat">
    personnage1.afficherInfosPersonnage();
    personnage2.afficherInfosPersonnage();
    affichage.afficherDebutCombat();
    
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Mécanique de combat">
        do {
            tour.afficheTour();
        
        for (int i = 0; i <= 100; i++) {
            if (i == personnage1.getInitiative()) {
                personnage1.frapperPersonnage(personnage2);
            }
            if (i == personnage2.getInitiative()) {
                personnage2.frapperPersonnage(personnage1);
            }
        }
        affichage.afficherSeparateurInfosPerso();
        personnage1.afficherInfosPersonnage();
        personnage2.afficherInfosPersonnage();
        personnage1.setNewInitiativeRandom();
        personnage2.setNewInitiativeRandom();
        tour.augmenteTour();
        affichage.afficherSeparateurDeTour();
       

    // TODO : La boucle contenant les étapes du combat
   
        } while (personnage1.getPointsDeVie() > 0 && personnage2.getPointsDeVie() > 0);
    // TODO : Après la boucle, afficher le résultat du combat
    // </editor-fold>
    }

}
