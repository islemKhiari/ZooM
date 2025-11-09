package prosit9;
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
    }
}
