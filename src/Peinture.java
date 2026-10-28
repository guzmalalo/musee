public class Peinture extends Oeuvre{
    private final String technique;

    public Peinture(String nom, int annee, float largeur, float hauteur, String technique){
        super(nom, annee, largeur, hauteur);
        this.technique = technique;
    }

    public String getTechnique(){
        return technique;
    }

}
