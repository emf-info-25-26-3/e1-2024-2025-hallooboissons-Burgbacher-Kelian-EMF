package app.models;

public class Commande {
    // attributs
    private Client client;
    private Cageot[] cageots;
    public final int NB_CAGEOT_PAR_COMMANDE = 8;

    // constructeur
    public Commande(Client client){
        this.client = client;
        cageots = new Cageot[NB_CAGEOT_PAR_COMMANDE];
    }

    // méthode
    public boolean ajouterCageot(Cageot cageotAStocker){
        boolean success = false;
        for (int i = 0; i < cageots.length; i++){
            if (cageots[i] == null){
                cageots[i] = cageotAStocker;
                success = true;
            }
        }
        return success;
    }
    public boolean supprimerCageot(Cageot cageotASupprimer){
        boolean success = false;
        for (int i = 0; i < cageots.length; i++){
            if (cageots[i] == cageotASupprimer){
                cageots[i] = null;
                success = true;
            }
        }
        return success;
    }
    public void annuleCommande(){
        for (int i = 0; i < cageots.length; i++){
            cageots[i] = null;
        }
    }

    // getteur
    public Cageot[] getCageots() {
        return cageots;
    }
    public Client getClient() {
        return client;
    }
    public double getPrixTotal(){
        double prixTot = 0;
        for (int i = 0; i < cageots.length; i++){
            if (cageots[i] != null){
                prixTot += cageots[i].getPrixTotal();
            }
        }
        return prixTot;
    }
}
