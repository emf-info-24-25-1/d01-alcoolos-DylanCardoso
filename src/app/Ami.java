package app;

public class Ami {
    private String nom;
    private int nbBiereAvantDetreSaoul;
    private boolean estCuit;

    public Ami(String nom, int nbBiereAvantDetreSaoul, boolean estCuit) {
        this.nom = nom;
        this.nbBiereAvantDetreSaoul = nbBiereAvantDetreSaoul;
        this.estCuit = estCuit;
    }

    public String getNom() {
        return nom;
    }

    public boolean getEstCuit() {
        return estCuit;
    }

    public void setEstCuit(boolean estCuit) {
        this.estCuit = estCuit;
    }

    public int getNbBiereAvantDetreSaoul() {
        return nbBiereAvantDetreSaoul;
    }

    public void boitUneBiere(){
        this.nbBiereAvantDetreSaoul--;
        System.out.println(this.nom + " boit une bière");
    }
}
