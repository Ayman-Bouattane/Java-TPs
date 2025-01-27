package EV;

//creation de la classe Client avec les attributes:
public class Client {
    private int Id;
    private String Nom;
    private Vehicule vehiculeLoué;

    //Ajouter un Constructeur
    public Client(int Id, String nom) {
        this.Id = Id;
        this.Nom = nom;
        this.vehiculeLoué = null;
    }

    //methodes pour acceder aux attributes:
    public int getId(){
        return Id;
    }
    public String getNom(){
        return Nom;
    }
    public Vehicule getVehiculeLoué(){
        return vehiculeLoué;
    }

    //methode pour louer un vehicule au client si disponible:
    public void louerVehicule(Vehicule vehicule){
        if (vehicule.isDisponible()) {
            vehicule.SetDisponible(false);
            this.vehiculeLoué = vehicule;
            System.out.println(Nom+ "a louer le vehicule: "+vehicule);
        } else{
            System.out.println("le vehicule "+vehicule.getModele()+ "n'est pas disponible");
        }
    }

    //methode pour retourner le vehicule apres location:
    public void retournerVehicule(){
        if (vehiculeLoué != null) {
            vehiculeLoué.SetDisponible(true);
            System.out.println(Nom+ "a retourner le vehicule" +vehiculeLoué);
            vehiculeLoué = null;
        } else{
            System.out.println(Nom+ "n'a pas de vehicule a retourner");
        }
    }
    //methode pour afficher les details de chaque client:
    public void afficherClients(){
        System.out.println("id du client: "+Id);
        System.out.println("nom du client: "+Nom);
        System.out.println("vehicule louer par le client: " +vehiculeLoué);
    }



}

