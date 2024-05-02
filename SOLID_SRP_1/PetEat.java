package SOLID_SRP_1;

public class PetEat {
    public String eat(Pet pet, String food){
        return pet.getOwner() + " is feeding " + pet.getPetName() + " " + food;
    }
}
