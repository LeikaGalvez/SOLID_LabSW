package SOLID_SRP_1;

public class PetEat {
    public Pet pet;

    public PetEat(Pet pet){
        this.pet=pet;
    }

    public String eat(Pet pet, String food){
        return pet.getOwner() + " is feeding " + pet.getPetName() + " " + food;
    }
}
