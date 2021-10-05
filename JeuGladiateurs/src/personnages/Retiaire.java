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
public class Retiaire extends Personnage{
    boolean filet = true;
    int random;
        
        public Retiaire(String nom, int pointsDeVie, int valeurMaxAttaque, int valeurDefense, int initiative) {
        super(nom, pointsDeVie, valeurMaxAttaque, valeurDefense, initiative);
        }
        
    @Override
    public void frapperPersonnage(Personnage personnageCible){
        super.frapperPersonnage(personnageCible);
        if (filet == true) {
           filet = false;
           System.out.println(nom + " lance sont filet");
           
        Random random = new Random();
        this.random = random.nextInt(10);
            if(this.random == 1){
               personnageCible.pointsDeVie = 0;
                System.out.println("Sont filet attrape " + nom + " et il l’empale sauvagement avec sa lance");
            } else {
                filet = false;
            }
        }
        else{
            System.out.println(nom + " ramasse son filet et en profite pour attaquer");
            filet = true;
            super.frapperPersonnage(personnageCible);
        }
    }
        

}
