package personnages;
import java.util.Random;

public class Personnage {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Attributs">
    String nom;
    int pointsDeVie;
    int valeurMaxAttaque;
    int valeurDefense;
    int initiative;
    int dommages;
    int forceDeFrape;
    
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Constructeurs et initialisation">
    public Personnage(String nomPersonnage, int attaqueMax, int defense, int pvs, int ini) {
        nom = nomPersonnage;
        pointsDeVie = pvs;
        valeurMaxAttaque = attaqueMax;  
        valeurDefense = defense;
        initiative = ini;
    }

    public Personnage() {
        nom = "";
        pointsDeVie = 0;
        valeurMaxAttaque = 0;
        valeurDefense = 0;
        initiative = 0;   
    }
    // </editor-fold>
    public String getNom() {
        return nom;
        // TODO : Afficher les infos du personnage, tel que montré dans l'énoncé
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    public int getValeurMaxAttaque() {
        return valeurMaxAttaque;
    }

    public void setValeurMaxAttaque(int valeurMaxAttaque) {
        this.valeurMaxAttaque = valeurMaxAttaque;
    }

    public int getValeurDefense() {
        return valeurDefense;
    }

    public void setValeurDefense(int valeurDefense) {
        this.valeurDefense = valeurDefense;
    }

    public int getInitiative() {
        return initiative;
    }

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Getters et setters">
    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    // </editor-fold>
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Mécanique de jeu">
    public void afficherInfosPersonnage() {
        System.out.println();
        System.out.println(this.nom);
        System.out.println("    Attaque : " + this.valeurMaxAttaque);
        System.out.println("    Défense : " + this.valeurDefense);
        System.out.println("    Points de vie : " + this.pointsDeVie);
        System.out.println("    Initiative : " + this.initiative);
        if (this.pointsDeVie > 0) {
            System.out.println("    Statut : Vivant");
        }
        else{
            System.out.println("    Statut : Mort");   
        }
    }

    private int attaqueCalcul() {
        Random random = new Random();
        return random.nextInt(valeurMaxAttaque + 1);
    }

    public void frapperPersonnage(Personnage personnageCible) {
        forceDeFrape = attaqueCalcul();
        dommages = forceDeFrape - personnageCible.valeurDefense;
        if (dommages < 0) {
            dommages = 0;
        }
        personnageCible.pointsDeVie = personnageCible.pointsDeVie - dommages;
        if (personnageCible.pointsDeVie < 0) {
            personnageCible.pointsDeVie = 0;
        }
        
        System.out.println("");
        System.out.println(nom + " attaque avec une puissance de : " + forceDeFrape);
        System.out.println(nom + " a une défence de : " + personnageCible.valeurDefense);
        System.out.println("Les dommages sont donc de : " + dommages);
    }

    public void setNewInitiativeRandom() {
        // TODO : Modifier de façon aléatoire la valeur INI du personnage.
    }
    // </editor-fold>
}
