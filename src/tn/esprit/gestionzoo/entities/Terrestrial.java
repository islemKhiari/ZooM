package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal implements Omnivore<Food>{
    protected int nbrLegs;

    public Terrestrial() {
        super();
    }
    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }
    @Override
    public String toString() {
        return super.toString() + ", nbrLegs=" + nbrLegs;
    }

    @Override
    public void eatMeat(Food meat) { System.out.println(" mange viande : " + meat); }

    @Override
    public void eatPlant(Food plant) { System.out.println(" mange plante : " + plant); }

    @Override
    public void eatPlantAndMeat(Food food) { System.out.println(" mange les deux : " + food); }

}
