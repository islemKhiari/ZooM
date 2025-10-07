package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;

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

        Animal tigre = new Animal("Felidae", "Tigre", 4, true);
        Animal elephant = new Animal("Elephantidae", "Éléphant", 10, true);
        Animal crocodile = new Animal("Crocodylidae", "Crocodile", 12, false);
        Animal lion = new Animal("Feline", "Lion", 5, true);
        Animal zebra = new Animal("Equidae", "Zebra", 3, true);
        Animal monkey = new Animal("Primate", "Monkey", 2, true);

        Zoo myZoo = new Zoo("My Zoo", "Tunis");

        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());
        System.out.println(tigre);
        System.out.println(lion.toString());


        Zoo zoo2 = new Zoo("My Zoo", "Paris");

        Animal zebra_test = new Animal("Feline", "Zebra", 5, true);
        zoo2.addAnimal(zebra_test);
        zoo2.addAnimal(lion);

        zoo2.addAnimal(zebra);
        zoo2.addAnimal(monkey);

        zoo2.displayZoo();

        System.out.println("la recherche du lion : " + zoo2.searchAnimal(zebra));

        System.out.println("la recherche du zebra_test : " + zoo2.searchAnimal(zebra_test));

        zoo2.removeAnimal(zebra_test);

        System.out.println("isZooFull: " + myZoo.isZooFull());
        System.out.println("isZooFull: " + zoo2.isZooFull());


        System.out.println("Le zoo avec le plus d’animaux est : " + Zoo.comparerZoo(myZoo, zoo2));


        Aquatic a = new Aquatic();
        Terrestrial t = new Terrestrial();
        Dolphin d = new Dolphin();
        Penguin p = new Penguin();

        Aquatic a1 = new Aquatic("Fish", "Shark", 8, false, "Ocean");
        Terrestrial t1 = new Terrestrial("Mammal", "Lion", 7, true, 4);

        Dolphin d1 = new Dolphin("Mammal", "Dolphin", 12, true, "Sea", 25.5f);
        Penguin p1 = new Penguin("Bird", "Penguin", 5, false, "Antarctica", 10.2f);



        System.out.println(a1.toString());
        System.out.println(t1.toString());
        System.out.println(d1.toString());
        System.out.println(p1.toString());


        a1.swim();
        d1.swim();
        p1.swim();

    }
}




