package tn.esprit.gestionzoo.entities;

public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
        else {
            System.out.println("Erreur"); this.age = 0;
        }
    }

    public void setMammal(boolean mammal) {
        this.isMammal = mammal;
    }

    public String toString() {
        return "Animal{name=" + name +
                ", family=" + family +
                ", age=" + age +
                ", isMammal=" + isMammal + "}";
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Animal other = (Animal) obj;
        return name.equals(other.name);
    }
    public Animal(){

    }
}
