package tn.esprit.entities;
import java.util.HashMap;
import tn.esprit.entities.Employe;
import java.util.TreeMap;
import java.util.Comparator;


public class AffectationHashMap {

    private HashMap<Employe, Departement> mapAffectations;

    public AffectationHashMap() {
        mapAffectations = new HashMap<>();
    }

    public HashMap<Employe, Departement> getMapAffectations() {
        return mapAffectations;
    }

    public void ajouterEmployeDepartement(Employe e, Departement d) {
        mapAffectations.put(e, d);
    }

    public void afficherEmployesEtDepartements() {
        for (var entry : mapAffectations.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    public void supprimerEmploye(Employe e) {
        mapAffectations.remove(e);
    }

    public void supprimerEmployeEtDepartement(Employe e, Departement d) {
        if (mapAffectations.containsKey(e) && mapAffectations.get(e).equals(d)) {
            mapAffectations.remove(e);
        }
    }

    public void afficherEmployes() {
        for (Employe e : mapAffectations.keySet()) {
            System.out.println(e);
        }
    }

    public void afficherDepartements() {
        for (Departement d : mapAffectations.values()) {
            System.out.println(d);
        }
    }

    public boolean rechercherEmploye(Employe e) {
        return mapAffectations.containsKey(e);
    }
    public boolean rechercherDepartement(Departement d) {
        return mapAffectations.containsValue(d);
    }
    public TreeMap<Employe, Departement> trierMap() {

        Comparator<Employe> comparatorById = new Comparator<Employe>() {
            @Override
            public int compare(Employe e1, Employe e2) {
                return Integer.compare(e1.getId(), e2.getId());
            }
        };

        TreeMap<Employe, Departement> sortedMap = new TreeMap<>(comparatorById);
        sortedMap.putAll(mapAffectations);

        return sortedMap;
    }
}



