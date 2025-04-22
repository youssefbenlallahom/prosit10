import java.util.Objects;

public class Departement {
    private int id;
    private String nom;
    private int nbEmployes;

    // Constructeur sans paramètres
    public Departement() {}

    // Constructeur avec paramètres
    public Departement(int id, String nom, int nbEmployes) {
        this.id = id;
        this.nom = nom;
        this.nbEmployes = nbEmployes;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getNbEmployes() {
        return nbEmployes;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNbEmployes(int nbEmployes) {
        this.nbEmployes = nbEmployes;
    }

    // Redéfinition de equals : basé sur id et nom
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Departement)) return false;
        Departement other = (Departement) obj;
        return id == other.id && nom.equalsIgnoreCase(other.nom);
    }

    // Redéfinition de hashCode (doit être cohérent avec equals)
    @Override
    public int hashCode() {
        return Objects.hash(id, nom.toLowerCase());
    }

    // Redéfinition de toString
    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nbEmployes=" + nbEmployes +
                '}';
    }
}
