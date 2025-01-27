package EV;

public class Scooter extends Vehicule{
    private boolean besoinPermis;

    public Scooter(int id, String modele, int autonomieBatterie, boolean besoinPermis) {
        super(id, modele, autonomieBatterie);
        this.besoinPermis = besoinPermis;
    }

    @Override
    public String toString() {
        return Id + Modele + autonomieBatterie +  besoinPermis+ estDisponible;
}
}
