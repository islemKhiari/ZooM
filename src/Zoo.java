public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    public Zoo(String name, String city, int nbrCages) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;

    }
    public void displayZoo() {
        System.out.println("Zoo: " + name + " Ville: " + city + " Nb cages: " + nbrCages);}

    public String toString() {
        return "Zoo{name=" + name + ", city=" + city + ", nbrCages=" + nbrCages + "}";
    }
}