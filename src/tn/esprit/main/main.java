package tn.esprit.main;

import tn.esprit.entities.SocieteArrayList ;
import tn.esprit.entities.Employe ;
import tn.esprit.entities.DepartementHashSet;
import tn.esprit.entities.Departement;
public class main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(1, "Khiari", "Islem", "IT", 3);
        Employe e2 = new Employe(2, "Ben Ali", "Nour", "RH", 2);
        Employe e3 = new Employe(3, "Trabelsi", "Sami", "IT", 1);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);

        System.out.println("Liste avant tri :");
        societe.displayEmploye();

        System.out.println("\n--- Tri par ID ---");
        societe.trierEmployeParId();
        societe.displayEmploye();

        System.out.println("\n--- Tri par Département puis Grade ---");
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();

        System.out.println("\nRecherche par nom 'Khiari' : " + societe.rechercherEmploye("Khiari"));
        System.out.println("Recherche par objet e2 : " + societe.rechercherEmploye(e2));

        System.out.println("\nSuppression de e1...");
        societe.supprimerEmploye(e1);
        societe.displayEmploye();


        DepartementHashSet gestionDep = new DepartementHashSet();

        Departement d1 = new Departement(1, "IT", 25);
        Departement d2 = new Departement(2, "RH", 10);
        Departement d3 = new Departement(3, "Finance", 15);

        gestionDep.ajouterDepartement(d1);
        gestionDep.ajouterDepartement(d2);
        gestionDep.ajouterDepartement(d3);

        System.out.println("Liste des départements :");
        gestionDep.displayDepartement();

        System.out.println("\nRecherche par nom 'IT' : " + gestionDep.rechercherDepartement("IT"));
        System.out.println("Recherche par objet d2 : " + gestionDep.rechercherDepartement(d2));

        System.out.println("\nSuppression du département RH");
        gestionDep.supprimerDepartement(d2);
        gestionDep.displayDepartement();

        System.out.println("\n Tri par ID");
        for (Departement d : gestionDep.trierDepartementById()) {
            System.out.println(d);


        }
    }}
