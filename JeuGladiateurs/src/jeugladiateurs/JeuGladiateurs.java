package jeugladiateurs;

import personnages.Personnage;
import personnages.Mirmillon;
import personnages.Retiaire;
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
    Mirmillon personnage3 = new Mirmillon("Bob le malchanceux", 15, 15, 70, 15);
    Retiaire personnage4 = new Retiaire("Igore l'emplaleur", 25, 5, 100, 30);

    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Affichage pré-combat">
    personnage3.afficherInfosPersonnage();
    personnage4.afficherInfosPersonnage();
    affichage.afficherDebutCombat();
    
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Mécanique de combat">
        do {
            tour.afficheTour();
        
        for (int i = 0; i <= 100; i++) {
            if (i == personnage3.getInitiative()) {
                personnage3.frapperPersonnage(personnage4);
            }
            if (i == personnage4.getInitiative()) {
                personnage4.frapperPersonnage(personnage3);
            }
        }
        affichage.afficherSeparateurInfosPerso();
        personnage3.afficherInfosPersonnage();
        personnage4.afficherInfosPersonnage();
        personnage3.setNewInitiativeRandom();
        personnage4.setNewInitiativeRandom();
        tour.augmenteTour();
        affichage.afficherSeparateurDeTour();
       
   
        } while (personnage3.getPointsDeVie() > 0 && personnage4.getPointsDeVie() > 0);
    affichage.afficheVictoire(personnage3, personnage4);
    // </editor-fold>
    }

}
