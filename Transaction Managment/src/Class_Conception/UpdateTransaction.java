package Class_Conception;

public class UpdateTransaction extends Transaction {
    //constrcteur pour mettre a jour une transaction:
    public UpdateTransaction(String transactionID, String clientID) {
        super(transactionID, clientID);
    }

    //implementation de la methode execute:
    @Override
    public void execute() {
        System.out.println("Mise à jour des informations du client avec ID: " + clientID);
    }
}
