package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    //int nbrCages;
    public static final int nbrCages = 25;
    private int nbAnimals;

//    public Zoo(String name, String city, int nbrCages) {
        public Zoo(String name, String city) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        //this.nbrCages = nbrCages;

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Erreur");
            this.name = "ZooInconnu";
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public void setnbAnimals(int nbAnimals) {
        this.nbAnimals = nbAnimals;
    }

    public Animal[] getAnimals() {
        return animals;
    }








    public void displayZoo() {
        System.out.println("Zoo: " + name + " Ville: " + city + " Nb cages: " + nbrCages);}

    public String toString() {
        return "Zoo{name=" + name + ", city=" + city + ", nbrCages=" + nbrCages + "}";
    }

    public boolean addAnimal(Animal animal) {
        if (isZooFull() ==false) {
            animals[nbAnimals] = animal;
            nbAnimals++;
            System.out.println(animal.getName() + " a été ajouté au zoo ");
            return true;
        } else {
            System.out.println("Impossible d’ajouter " + animal.getName()
                    );
            return false;
        }

    }
    public void displayAnimals() {
        System.out.println("Liste des animaux du zoo :");
        for (int i = 0; i < nbAnimals; i++) {
            System.out.println("[" + i + "] " + animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbAnimals; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }
    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            System.out.println(animal.getName() + " n’existe pas dans le zoo !");
            return false;
        }
        for (int i = index; i < nbAnimals - 1; i++) {
            animals[i] = animals[i + 1];
        }

        animals[nbAnimals - 1] = null;
        nbAnimals--;

        System.out.println(animal.getName() + " a été supprimé du zoo.");
        return true;
    }
    public boolean isZooFull() {
        return nbAnimals >= nbrCages;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbAnimals >= z2.nbAnimals) {
            return z1;
        } else {
            return z2;
        }
    }

    }


