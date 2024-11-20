package tn.essat.fin;

public class adm {
    private int id;
    private String nom;
    private String prenom;
    private String  motdepasse;
    private String Email;
    private String ecole;
    private  String annee_universitaire;


    public adm(int id, String nom, String prenom, String  motdepasse, String Email, String ecole, String annee_universitaire) {
        this.id = id;
        this.nom = nom;
        this.motdepasse =motdepasse;
        this.Email = Email;
        this.ecole = ecole;
        this.annee_universitaire = annee_universitaire;
    }

    public adm() {

    }

    public void setId(int id) {
        this.id = id;
    }


    public int getId() {
        return id;
    }

    public String getAnnee_universitaire() {
        return annee_universitaire;
    }

    public void setAnnee_universitaire(String annee_universitaire) {
        this.annee_universitaire = annee_universitaire;
    }

    public String getEcole() {
        return ecole;
    }

    public void setEcole(String ecole) {
        this.ecole = ecole;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getMotdepasse() {
        return motdepasse;
    }

    public void setMotdepasse(String motdepasse) {
        this.motdepasse = motdepasse;
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
}
