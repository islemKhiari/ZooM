package tn.esprit.entities;

import tn.esprit.entities.Departement;
import tn.esprit.entities.IDepartement;

import java.util.HashSet;
import java.util.TreeSet;

    public class DepartementHashSet implements IDepartement<Departement> {

        private HashSet<Departement> setDepartements = new HashSet<>();

        @Override
        public void ajouterDepartement(Departement d) {
            setDepartements.add(d);
        }

        @Override
        public boolean rechercherDepartement(String nom) {
            for (Departement d : setDepartements) {
                if (d.getNomDepartement().equalsIgnoreCase(nom))
                    return true;
            }
            return false;
        }

        @Override
        public boolean rechercherDepartement(Departement d) {
            return setDepartements.contains(d);
        }

        @Override
        public void supprimerDepartement(Departement d) {
            setDepartements.remove(d);
        }

        @Override
        public void displayDepartement() {
            for (Departement d : setDepartements) {
                System.out.println(d);
            }
        }

        @Override
        public TreeSet<Departement> trierDepartementById() {
            TreeSet<Departement> sortedSet = new TreeSet<>((d1, d2) -> Integer.compare(d1.getId(), d2.getId()));
            sortedSet.addAll(setDepartements);
            return sortedSet;
        }
    }



