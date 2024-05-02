package SOLID_SRP_1;

public class PetSound {
    public String makeSound(Pet pet, String sound){
        return pet.getPetName() + " is " + sound + "ing!";
    }
}
