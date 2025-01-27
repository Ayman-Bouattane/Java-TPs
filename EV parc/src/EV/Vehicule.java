package EV;


public abstract class Vehicule {
    //creation de la classe vehicule avec les attributes:
    int Id;
    String Modele;
    int autonomieBatterie;
    boolean estDisponible;

    //ajouter un constructeur:
    public Vehicule(int Id, String Modele, int autonomieBatterie) {
    this.Id = Id;
    this.Modele = Modele;
    this.autonomieBatterie = autonomieBatterie;
    this.estDisponible = true; //par defaut le vehicule est disponible
    }

    //methodes pour acceder aux attributes
    public int getId(){
        return Id;
    }
    public String getModele(){
        return Modele;
    }
    public int getAutonomieBatterie(){
        return autonomieBatterie;
    }
    public boolean isDisponible(){
        return estDisponible;
    }

    //methode pour modifier la disponibilite du vehicule:
    public void SetDisponible(boolean estDisponible){
        this.estDisponible = estDisponible;
    }

    //chaine de charactere des informations des vehicules:
    public abstract String toString();
}
