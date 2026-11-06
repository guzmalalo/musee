public class Peinture extends Oeuvre{
    private final String technique;

    private static int nbPeintures =0;

    public Peinture(String nom, int annee, float largeur, float hauteur, String technique){
        super(nom, annee, largeur, hauteur);
        this.technique = technique;

        nbPeintures ++;
    }

    public String getTechnique(){
        return technique;
    }

    public static int getNbPeintures(){
        return nbPeintures;
    }


    @Override
    public String toString(){
        return super.toString() + "-" + technique;
    }

}
