package Class_Conception;

//creation de la classe abstraite Transaction avec les attributes suivants:
public abstract class Transaction {
    protected String transactionID;
    protected String clientID;

    //Ajouter un Constructeur:
    public Transaction(String transactionID, String clientID) {
        this.transactionID = transactionID;
        this.clientID = clientID;

    }

    //methodes a implementé:
    //methode abstraite
    public abstract void execute();

    //methode non abstraite: pour Affiche les informations de base sur la transaction:
    public void showDetails() {
        System.out.println("Transaction ID: " + transactionID + " | Client ID: " + clientID);
    }
}