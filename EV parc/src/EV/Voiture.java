package EV;

public class Voiture extends Vehicule {
    private int nombrePortes;

    public Voiture(int Id, String Modele, int autonomieBatterie, int nombrePortes) {
        super(Id, Modele, autonomieBatterie);
        this.nombrePortes = nombrePortes;
    }

    @Override
    public String toString() {
        return Id  + Modele + autonomieBatterie + nombrePortes + estDisponible;
    }
}
