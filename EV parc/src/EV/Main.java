package EV;

public class Main {
    public static void main(String[] args) {
        GestionParc gestionParc = new GestionParc();

        //creation de quelques vehicules:
        Vehicule vehicule1 = new Vehicule(1, "Porsche Taycan Turbo S", 600);
        Vehicule vehicule2 = new Vehicule(2, "Tesla Model S Plaid", 390);
        Vehicule vehicule3 = new Vehicule(3, "Mercedes EVO Q", 500);

        //Ajout des vehicules au parc:
        GestionParc.ajouterVehicule(vehicule1);
        GestionParc.ajouterVehicule(vehicule2);
        GestionParc.ajouterVehicule(vehicule3);

        //creation des clients:
        Client client1 = new Client(1,"Amine");
        Client client2 = new Client(2,"Khalid");
        Client client3 = new Client(3,"Karim");

        //Ajouter des clients au parc:
        GestionParc.ajouterClient(client1);
        GestionParc.ajouterClient(client2);
        GestionParc.ajouterClient(client3);

        //afficher les vehicules disponibles:
        GestionParc.afficherVehiculesDisponibles();

        // client1 a louer une vehicule
        GestionParc.affecterVehiculeAClient(client1, 1);

        //afficher les vehicule disponible apres la location:
        GestionParc.afficherVehiculesDisponibles();

        //client1 retourne le vehicule:
        GestionParc.retournerVehicule(client1);

        //afficher les vehicules dispo apres retour:
        GestionParc.afficherVehiculesDisponibles();

        //afficher les clients
        GestionParc.afficherClients();
    }
}