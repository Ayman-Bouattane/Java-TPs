package Class_Conception;

public class DeleteTransaction extends Transaction {
    // Constructeur pour initialiser une transaction d'insertion
    public DeleteTransaction(String transactionID, String clientID) {
        super(transactionID, clientID);
    }

    // Implémentation de la méthode execute()
    @Override
    public void execute() {
        System.out.println("Supression de client avec ID: " + clientID);
}

}
