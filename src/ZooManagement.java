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


        System.out.println("Le zoo avec le plus d’animaux est : " +  Zoo.comparerZoo(myZoo, zoo2) );

    }


    }




