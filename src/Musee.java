import java.sql.ClientInfoStatus;
import java.util.ArrayList;

public class Musee {
    private final String nom;
    private Adresse adresse;
    private ArrayList<Salle> salles;

    // --- Constructors
    public Musee(String nom,int numero, String rue, String codePostal, String ville) {
        this.nom = nom;
        this.adresse = new Adresse(numero, rue, codePostal, ville);
        salles = new ArrayList<>();
    }

    // --- Getters
    public String getNom(){
        return nom;
    }

    public void setNumero(int numero){
        adresse.setNumero(numero);
    }

    // methodes
    public void ajouterSalle(int etage, String nom, float superfice){
        Salle temp = new Salle(etage, nom, superfice);
        salles.add(temp);
    }

    public void ajouterOeuvre(String nomSalle, Oeuvre o){

        Salle temp = null;

        // chercher la salle nom Salle
        for (Salle s : salles ){
            if(s.getNom().equalsIgnoreCase(nomSalle)){
                // on a trouvé la salle
                s.ajouterOeuvre(o);
                System.out.println("Oeuvre ajoutée");
                return;
            }
        }

        System.out.println("Salle non trouvée");
    }

    // --- Overrides
    @Override
    public String toString() {
        String message = "Musee : " + nom  + "\nAdresse: "+ adresse.toString();
        message += "\nSalles : \n";
        for (Salle s: salles){
            message += s.toString() + "\n";
        }

        return message;
    }
}
