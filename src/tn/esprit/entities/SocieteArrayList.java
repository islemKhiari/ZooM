package tn.esprit.entities;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SocieteArrayList implements IGestion<Employe> {

    private ArrayList<Employe> listEmployes = new ArrayList<>();

    @Override
    public void ajouterEmploye(Employe e) {
        listEmployes.add(e);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe e : listEmployes) {
            if (e.getNom().equalsIgnoreCase(nom))
                return true;
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return listEmployes.contains(e);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        listEmployes.remove(e);
    }

    @Override
    public void displayEmploye() {
        for (Employe e : listEmployes) {
            System.out.println(e);
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(listEmployes, Comparator.comparingInt(Employe::getId));
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Collections.sort(listEmployes, Comparator
                .comparing(Employe::getNomDepartement)
                .thenComparing(Employe::getGrade));
    }
}
