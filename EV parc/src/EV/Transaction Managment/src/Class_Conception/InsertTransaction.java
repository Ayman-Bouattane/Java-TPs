package Class_Conception;

public class InsertTransaction extends Transaction {
    // Constructeur pour initialiser une transaction d'insertion
    public InsertTransaction(String transactionID, String clientID) {
        super(transactionID, clientID);
    }

    // Implémentation de la méthode execute()
    @Override
    public void execute() {
        System.out.println("Insertion d'un nouveau client avec ID: " + clientID);
}

}
