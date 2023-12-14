import java.util.Vector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class EspritArrayList implements University{
    private ArrayList<Etudiant> etudiants = new ArrayList<>();

    @Override
    public void ajouterEtudiant(Etudiant e) {
        etudiants.add(e);
    }

    @Override
    public boolean rechercherEtudiant(Etudiant e) {
        return etudiants.contains(e);
    }

    @Override
    public boolean rechercherEtudiant(String nom) {
        for (Etudiant etudiant : etudiants) {
            if (etudiant.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void supprimerEtudiant(Etudiant e) {
        etudiants.remove(e);
    }

    @Override
    public void displayEtudiants() {
        for (Etudiant etudiant : etudiants) {
            System.out.println(etudiant);
        }
    }

    @Override
    public void trierEtudiantsParId() {
        Collections.sort(etudiants, Comparator.comparingInt(Etudiant::getId));
    }

    @Override
    public void trierEtudiantsParNom() {
        Collections.sort(etudiants, Comparator.comparing(Etudiant::getNom));
    }
}
