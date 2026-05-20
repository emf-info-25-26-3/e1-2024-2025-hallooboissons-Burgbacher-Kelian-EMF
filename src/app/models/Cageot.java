package app.models;

public class Cageot {
    // attributs
    private String identifiant;
    private Bouteille[] bouteilles;
    public final int NB_BOUTEILLE_PAR_CAGEOT = 12;

    // constructeur
    public Cageot(String identifiant){
        this.identifiant = identifiant;
        bouteilles = new Bouteille[NB_BOUTEILLE_PAR_CAGEOT];
    }

    // méthode
    public boolean stockerBouteille(Bouteille bouteilleAStocker){
        boolean success = false;
        for (int i = 0; i < bouteilles.length; i++){
            if (bouteilles[i] == null){
                bouteilles[i] = bouteilleAStocker;
                success = true;
            }
        }
        return success;
    }
    public boolean prendreBouteille(Bouteille bouteilleAPrendre){
        boolean success = false;
        for (int i = 0; i < bouteilles.length; i++){
            if (bouteilles[i] == bouteilleAPrendre){
                bouteilles[i] = null;
                success = true;
            }
        }
        return success;
    }

    // getteur
    public String getIdentifiant() {
        return identifiant;
    }
    public int getNbBouteillesDansCageot(){
        int nb = 0;
        for (int i = 0; i < bouteilles.length; i++){
            if (bouteilles[i] != null){
                nb++;
            }
        }
        return nb;
    }
    public int getNbPlaceRestante(){
        return NB_BOUTEILLE_PAR_CAGEOT - getNbBouteillesDansCageot();
    }
    public Bouteille[] getBouteilles() {
        return bouteilles;
    }
    public double getPrixTotal(){
        double prixTot = 0;
        for (int i = 0; i < bouteilles.length; i++){
            if (bouteilles[i] != null){
                prixTot += bouteilles[i].getPrix();
            }
        }
        return prixTot;
    }

    // toString
    @Override
    public String toString() {
        return "Cageot " + identifiant + " avec " + getNbBouteillesDansCageot() + "/" + NB_BOUTEILLE_PAR_CAGEOT + " bouteilles";
    }
}
