import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;
import java.time.LocalDate;


public class App {
    public TreeSet<Artiste> artistes = new TreeSet<>();
    private Musee musee;
    private ArrayList<Oeuvre> oeuvres = new ArrayList<>();

    public App() {
        musee = new Musee("Louvre", 1, "Rivoli", "75001", "Paris");
    }

    public void run() {
        int choix = 0;
        Scanner sc = new Scanner(System.in);

        // Chargement d
       chargementDefaut();

        do {
            System.out.println("Bienvenue à la gestion du musée " + musee.getNom());
            System.out.println("0. Sortir");
            System.out.println("1. Afficher les musée");
            System.out.println("2. Afficher les artistes");
            System.out.println("3. Afficher les ouvres");
            System.out.println("===========================");
            System.out.print("Votre choix :? ");
            choix = sc.nextInt();

            switch (choix){
                case 1 -> System.out.println(musee);
                case 2 -> System.out.println(artistes);
                case 3 -> System.out.println(oeuvres);
                default -> System.out.println("Choix inconnu");
            }

        } while (choix != 0);

        System.out.println("Au revoir");
    }


    public void chargementDefaut(){

        // salles par defaut
        musee.ajouterSalle(0, "Récéption", 100.0f);
        musee.ajouterSalle(1, "Salle Mollien", 150.0f);

        // artistes par défaut
        Artiste eugene = new Artiste("Delacroix", "Eugène", LocalDate.of(1798, 4, 26));
        artistes.add(eugene);

        //oeuvres par defaut
        Peinture liberte = new Peinture("La Liberté guidant le peuple",1830, 3.25f, 2.60f,"Oleo");
        Sculpture david =  new Sculpture("David", 1500, -200, 517, 200, "Marbre blanc");

        oeuvres.add(liberte);
        oeuvres.add(david);

        // lien oeuvres <-> artiste
        liberte.setArtiste(eugene);

        // lien oeuvres <-> salles
        musee.ajouterOeuvre("Salle Mollien", liberte);
        musee.ajouterOeuvre("Récéption", david);
    }

}
