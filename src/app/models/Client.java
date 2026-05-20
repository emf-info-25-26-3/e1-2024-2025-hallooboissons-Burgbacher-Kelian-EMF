package app.models;

public class Client {
    // attributs
    private String nom;
    private String prenom;
    private String ville;

    // constructeur
    public Client(String nom, String prenom, String ville){
        this.nom = nom;
        this.prenom = prenom;
        this.ville = ville;
    }

    // méthode


    // getteur
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public String getVille() {
        return ville;
    }

    // toString
    @Override
    public String toString() {
        return "Client " + nom.toUpperCase() + " " + prenom.toLowerCase() + " - " + ville;
    }
}
