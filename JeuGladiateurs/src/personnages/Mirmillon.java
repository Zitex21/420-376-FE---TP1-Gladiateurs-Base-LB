/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnages;

import java.util.Random;

/**
 *
 * @author ETI
 */
public class Mirmillon extends Personnage{
    public Mirmillon(String nom, int pointsDeVie, int valeurMaxAttaque, int valeurDefense, int initiative) {
        super(nom, pointsDeVie, valeurMaxAttaque, valeurDefense, initiative);
        
    }
    
    @Override
    public void frapperPersonnage(Personnage personnageCible){
        super.frapperPersonnage(personnageCible);
        if (personnageCible.pointsDeVie == 0) {
            System.out.println("Il décapite sont adversaire");
        }else{
            super.frapperPersonnage(personnageCible);
        }
    }
    
    @Override
    public void setNewInitiativeRandom(){
        Random rand = new Random();
        this.setInitiative(rand.nextInt(31));
    }
}
