package Class_Conception;

public class main {
    public static void main(String[] args) throws Exception {
        // Créer une instance de BigDataManager
        BigDataManager manager = new BigDataManager();

        // Ajouter différentes transactions
        manager.addTransaction(new InsertTransaction("T001", "C001"));
        manager.addTransaction(new UpdateTransaction("T002", "C002"));
        manager.addTransaction(new DeleteTransaction("T003", "C003"));

        // Traiter toutes les transactions
        manager.processAllTransactions();

        // Afficher les statistiques des transactions
        manager.printTransactionStats();
    }
}
