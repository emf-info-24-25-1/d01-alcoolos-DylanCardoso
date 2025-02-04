package app;

public class Ami {
    private final String nom;
    private int nbBiereAvantDetreSaoul;
    private boolean estCuit;

    public Ami(String nom, int nbBiereAvantDetreSaoul) {
        this.nom = nom;
        this.nbBiereAvantDetreSaoul = nbBiereAvantDetreSaoul;
        this.estCuit = (nbBiereAvantDetreSaoul == 0) ? true : false;
    }

    public String getNom() {
        return nom;
    }

    public boolean isCuit() {
        return estCuit;
    }

    public void setEstCuit(boolean estCuit) {
        this.estCuit = estCuit;
    }

    public int getNbBiereAvantDetreSaoul() {
        return nbBiereAvantDetreSaoul;
    }

    public void boitUneBiere(){
        if (nbBiereAvantDetreSaoul == 0) {
            setEstCuit(true);
        } else {
            nbBiereAvantDetreSaoul--;
        }
        System.out.println(this.nom + " boit une bière");
    }
}
