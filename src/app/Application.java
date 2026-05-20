package app;

import app.models.*;
import java.text.DecimalFormat;

public class Application {

    public static void main(String[] args) {
        DecimalFormat formatPrix = new DecimalFormat("##0.0");
        Commande[] commandes = new Commande[10];
        commandes[0] =  new Commande(new Client("ducobu", "jean", "bulle"));
        Cageot X83H4 = new Cageot("X83H4");
        for(int i = 0; i < 6; i++){
            X83H4.stockerBouteille(new Bouteille("Henniez rouge", 2.60, 1, true));    
        }
        for(int i = 0; i < 6; i++){
            X83H4.stockerBouteille(new Bouteille("Henniez verte", 2.60, 1, true));    
        }
        commandes[0].ajouterCageot(X83H4);
        Cageot X83H5 = new Cageot("X83H5");
        for(int i = 0; i < 2; i++){
            X83H5.stockerBouteille(new Bouteille("Coca-Cola", 3.85, 1.5, false));    
        }
        commandes[0].ajouterCageot(X83H5);
        Cageot X83H6 = new Cageot("X83H6");
        X83H6.stockerBouteille(new Bouteille("Pepsi", 3.55, 1.5, false));    
        X83H6.stockerBouteille(new Bouteille("Sinalco", 4.25, 1.5, false));    
        commandes[0].ajouterCageot(X83H5);
        
        commandes[1] = new Commande(new Client("HARONI", "mac", "fribourg"));
        Cageot X83H7 = new Cageot("X83H7");
        X83H7.stockerBouteille(new Bouteille("Henniez rouge", 2.60, 1, true));    
        X83H7.stockerBouteille(new Bouteille("Coca-Cola", 3.85, 1.5, false));  
        X83H7.stockerBouteille(new Bouteille("Coca-Cola", 3.85, 1.5, false));    
        commandes[1].ajouterCageot(X83H7);
        
        for (int i = 0; i < commandes.length; i++){
            afficherCommande(commandes[i], formatPrix);
        }
    }

    public static void afficherCommande(Commande commande, DecimalFormat formatPrix) {
        if (commande != null){
            
            System.out.println("---------------------------------");
            System.out.println("Commande pour le client : " + commande.getClient());
            Cageot[] cageots = commande.getCageots();
            int nb = 0;
            for (int i = 0; i < cageots.length; i++){
                if (cageots[i] != null){
                    nb++;
                }
            }
            System.out.println("La commande contient " + nb + " cageots");
            System.out.println("Le prix total de la commande est de " + formatPrix.format(commande.getPrixTotal()) + " Frs");
        }
    }
}
