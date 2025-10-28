import JavaAvance4IIR.GestionBibliotheque;
import JavaAvance4IIR.GestionTaches;
import JavaAvance4IIR.Livre;
import JavaAvance4IIR.Tache;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    /*    GestionBibliotheque gb = new GestionBibliotheque();
        gb.ajouterLivre(new Livre("L'Étranger", "Albert Camus", 1942));
        gb.ajouterLivre(new Livre("1984", "George Orwell", 1949));
        gb.afficherLivres();*/

        // ____________gestion taches et tache _________
// Exemple d'utilisation de la classe GestionTaches :
// On crée un gestionnaire de tâches, on y ajoute deux tâches,
// on marque la première comme terminée, puis on affiche la liste des tâches.
        GestionTaches gt = new GestionTaches();
        gt.ajouterTache(new Tache("Faire les devoirs"));
        gt.ajouterTache(new Tache("Préparer la présentation"));
        gt.terminerPremiereTache();
        gt.afficherTaches();
    }
}