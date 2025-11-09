package tn.esprit.gestionzoo.entities;

public abstract class Aquatic extends Animal implements Carnivore<Food>{
    protected String habitat;

    public Aquatic() {
        super();
    }
    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }
    public abstract void swim();

    /*
    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }

 */


    @Override
    public String toString() {
        return super.toString() + ", habitat=" + habitat;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        // On cast en Aquatic pour accéder aux attributs
        Aquatic other = (Aquatic) obj;

        return this.getName().equals(other.getName()) &&
                this.getAge() == other.getAge() &&
                this.habitat.equals(other.habitat);
    }

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH)
            System.out.println(" mange : " + meat);
        else
            System.out.println(" ne peut pas manger : " + meat);
    }


}
