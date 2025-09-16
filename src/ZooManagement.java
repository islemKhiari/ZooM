import java.util.Scanner;

public class ZooManagement {
    /*public static void main(String[] args) {
        int nbrCages=20;
        String zooName ="my zoo";
        System.out.println(nbrCages + zooName);

        Scanner input = new Scanner(System.in);

        zooName= "";
        while(zooName.equals("")){
            System.out.println("insert zoo name");
            zooName= input.nextLine();
        }

        System.out.println("insert cage number");
        nbrCages = input.nextInt();

        while (nbrCages<0){
            System.out.println("entrer un entier positif");
            nbrCages = input.nextInt();
        }

        System.out.println( zooName+" comporte " +nbrCages+" cages");
        }*/
    public static void main(String[] args) {

        /* Animal lion = new Animal();
        lion.age = 20;
        lion.name = "Lion";
        lion.family = "Mammal";
        lion.isMammal = true;

        Zoo myZoo = new Zoo();
        myZoo.name = "My Zoo";
        myZoo.animals= lion;
        myZoo.city="tunis";
        myZoo.nbrCages=25;
        */

        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal tigre = new Animal("Felidae", "Tigre", 4, true);
        Animal elephant = new Animal("Elephantidae", "Éléphant", 10, true);
        Animal crocodile = new Animal("Crocodylidae", "Crocodile", 12, false);

        Zoo myZoo = new Zoo("My Zoo", "Tunis", 20);

        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        System.out.println(tigre);
        System.out.println(lion.toString());


    }


}

