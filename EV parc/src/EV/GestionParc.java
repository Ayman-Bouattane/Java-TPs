package EV;

import java.util.ArrayList;

//creation de la classe GestionParc avec les attributes:
public class GestionParc {
    private static ArrayList<Vehicule> listVehicules;
    private static ArrayList<Client> listClients;

    //Ajouter un constructeur:
    public GestionParc() {
        this.listVehicules = new ArrayList<>();
        this.listClients = new ArrayList<>();
    }
    //methode pour ajouter un vehicule dans le parc:
    public static void ajouterVehicule(Vehicule vehicule) {
        listVehicules.add(vehicule);
    }

    //methode pour ajouter un client a la list:
    public static void ajouterClient(Client client) {
    listClients.add(client);
    }

    //louer un vehicule au client si disponible:
    public static void affecterVehiculeAClient(Client client, int vehiculeId){
    for (Vehicule vehicule : listVehicules) {
        if (vehicule.getId() == vehiculeId) {
            client.louerVehicule(vehicule);
            return;
        }
    }
    System.out.println("Vehicule n'existe pas !");
    }

    //le client retourne le vehicule emprunte"
    public static void retournerVehicule(Client client){
        client.retournerVehicule();
    }

    //afficher tous les vehicules disponibles:
    public static void afficherVehiculesDisponibles(){
    System.out.println("Vehicules disponibles : ");
    for (Vehicule vehicule : listVehicules) {
        if (vehicule.isDisponible()) {
            System.out.println(vehicule);
        }
    }
    }

    //afficher tous les clients et leurs informations:
    public static void afficherClients(){
    System.out.println("Clients : ");
    for (Client client : listClients) {
        System.out.println(client);
    }
    }
}
