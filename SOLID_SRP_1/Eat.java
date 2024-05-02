package SOLID_SRP_1;

public class Eat {
    public Pet pet;

    public Eat(Pet pet){
        this.pet=pet;
    }

    public String eat(Pet pet, String food){
        return pet.getOwner() + " is feeding " + pet.getPetName() + " " + food;
    }
}
