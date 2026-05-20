package app.models;
import java.text.DecimalFormat;

public class Bouteille {
    // attributs 
    private String nom;
    private double prix;
    private double contenance;
    private double remplissage;
    private boolean enVerre;

    // constructeur
    public Bouteille(String nom, double prix, double contenance, boolean enVerre){
        this.nom = nom;
        this.prix = prix;
        this.contenance = contenance;
        remplissage = 100.0;
        this.enVerre = enVerre;
    }

    // méthode


    //setter et getteur
    public double getContenance() {
        return contenance;
    }
    public String getNom() {
        return nom;
    }
    public double getPrix() {
        return prix;
    }
    public double getRemplissage() {
        return remplissage;
    }
    public void setRemplissage(double remplissage) {
        this.remplissage = remplissage;
    }

    // toString
    @Override
    public String toString() {
        DecimalFormat formatContenace = new DecimalFormat("##0.0");
        DecimalFormat formatPrix = new DecimalFormat("#'##0,00");
        String string2Return = "Bouteille \'" + nom + "\' de " + formatContenace.format(contenance) + "L en verre à " + formatPrix.format(prix) + " Frs - ";
        if (remplissage == 100.0){
            string2Return += "pleine";
        } else if (remplissage == 0.0){
            string2Return += "vide";
        } else {
            string2Return += "entamée";
        }
        return string2Return;
    }
}
