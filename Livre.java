package JavaAvance4IIR;
//il faut ajouter un attribut dans liver de type gestionbibliotheque

public class Livre {
    private String titre;
    private String auteur;
    private int annee;
    private GestionBibliotheque b ; 

    public Livre(String titre, String auteur, int annee) {
        this.titre = titre;
        this.auteur = auteur;
        this.annee = annee;
    }

    public String getTitre() { return titre; }
    public String getAuteur() { return auteur; }
    public int getAnnee() { return annee; }

    @Override
    public String toString() {
        return "Livre{" +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", annee=" + annee +
                '}';
    }
}
