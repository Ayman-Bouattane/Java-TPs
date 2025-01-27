package EV;

public class Camion extends Vehicule {
    private int capaciteChargement;

    public Camion(int Id, String Modele, int autonomieBatterie, int capaciteChargement) {
        super(Id, Modele, autonomieBatterie);
        this.capaciteChargement = capaciteChargement;
    }

    @Override
    public String toString() {
        return Id + Modele + autonomieBatterie + capaciteChargement + estDisponible;
    }

}
