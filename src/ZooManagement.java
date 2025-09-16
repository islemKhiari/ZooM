import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
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


    }
}

