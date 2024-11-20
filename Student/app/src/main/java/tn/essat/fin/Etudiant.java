package tn.essat.fin;
public class Etudiant {
    private int id;
    private String nom;
    private String prenom;
    private String nomParent;
    private String filiere;
    private int numParent;
    private int note;

    public Etudiant(int id, String nom, String prenom, String filiere, int note, String nomParent, int numeroParent) {

    }
    // Méthode toString pour afficher les informations de l'étudiant
    @Override
    public String toString() {
        return "ID: " + id +
                ", Nom: " + nom +
                ", Prénom: " + prenom +
                ", Filière: " + filiere +
                ", Note: " + note +
                ", Nom du Parent: " + nomParent +
                ", Numéro du Parent: " + numParent;
    }
    public Etudiant(int id, String nom, String prenom, String filiere, String nomParent, int numParent, int note) {
        this.id=id;
        this.nom=nom;
        this.prenom =prenom;
        this.nomParent=nomParent;
        this.filiere=filiere;
        this.note=note;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public int getNumParent() {
        return numParent;
    }

    public void setNumParent(int numParent) {
        this.numParent = numParent;
    }

    public String getFiliere() {
        return filiere;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }

    public String getNomParent() {
        return nomParent;
    }

    public void setNomParent(String nomParent) {
        this.nomParent = nomParent;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}