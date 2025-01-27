package Class_Conception;

import java.util.List;
import java.util.ArrayList;

public class BigDataManager {
    // Attributs d'instance
    private List<Transaction> transactions;
    private int successTransactionCount;
    private int failedTransactionCount;

    // Constructeur
    public BigDataManager() {
        this.transactions = new ArrayList<>();
        this.successTransactionCount = 0;
        this.failedTransactionCount = 0;
    }

    // Ajouter une transaction
    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    // Traiter toutes les transactions
    public void processAllTransactions() throws Exception {
        for (Transaction t : transactions) {
            t.showDetails();
            try {
                // Simuler une erreur pour la transaction avec ID "T003"
                if (t.transactionID.equals("T003")) {
                    throw new Exception("Échec de la suppression du client");
                }

                // Traiter la transaction
                TransactionProcessor.processTransaction(t);
                successTransactionCount++;

            } catch (Exception e) {
                // En cas d'échec, augmenter le compteur des échecs
                failedTransactionCount++;
                System.out.println("Échec de la transaction : " + t.transactionID + " (" + e.getMessage() + ")");
            }
            System.out.println();  // Pour espacer les résultats
        }
    }

    // Méthode pour afficher les statistiques des transactions
    public void printTransactionStats() {
        System.out.println("Transactions réussies : " + successTransactionCount);
        System.out.println("Transactions échouées : " + failedTransactionCount);
    }
}
