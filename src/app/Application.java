package app;

public class Application {
    public static void main(String[] args) {


        Ami ami1 = new Ami("Dylan", 7);
        Ami ami2 = new Ami("Tomas", 6);
        Ami ami3 = new Ami("Elise", 5);   

        while (true) {
            if (ami1.getNbBiereAvantDetreSaoul() == 0 && !ami1.isCuit()) {
                ami1.setEstCuit(true);
                System.out.println(
                ami1.getNom() + " ne peut plus boire de biere... les autres continue !");
            } else if (ami2.getNbBiereAvantDetreSaoul() == 0 && !ami2.isCuit()) {
                ami2.setEstCuit(true);
                System.out.println(
                ami2.getNom() + " ne peut plus boire de biere... les autres continue !");
            } else if (ami3.getNbBiereAvantDetreSaoul() == 0 && !ami3.isCuit()) {
                ami3.setEstCuit(true);
                System.out.println(
                ami3.getNom() + " ne peut plus boire de biere... les autres continue !");
            }
            if (ami1.getNbBiereAvantDetreSaoul() != 0) {
                ami1.boitUneBiere();
            }
            if (ami2.getNbBiereAvantDetreSaoul() != 0) {
                ami2.boitUneBiere();
            }
            if (ami3.getNbBiereAvantDetreSaoul() != 0) {
                ami3.boitUneBiere();
            }
            if (ami1.isCuit() == true && ami2.isCuit() && ami3.isCuit() ) {
                break;
            }
        }
        System.out.println("mais enfaite tout le monde est Saouls...");
    }
}
