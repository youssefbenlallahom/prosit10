import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        DepartementHashSet dhs = new DepartementHashSet();

        Departement d1 = new Departement(1, "Informatique", 50);
        Departement d2 = new Departement(2, "RH", 30);
        Departement d3 = new Departement(3, "Marketing", 20);

        dhs.ajouterDepartement(d1);
        dhs.ajouterDepartement(d2);
        dhs.ajouterDepartement(d3);

        System.out.println("Liste des départements :");
        dhs.displayDepartement();

        System.out.println("\nRecherche par nom 'RH' : " + dhs.rechercherDepartement("RH"));

        System.out.println("\nTri par ID :");
        TreeSet<Departement> sorted = dhs.trierDepartementById();
        sorted.forEach(System.out::println);
    }
}
