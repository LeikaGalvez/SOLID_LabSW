package SOLID_SRP_1;

public class MakeSound {
    public Pet pet;

    public MakeSound(Pet pet){
        this.pet=pet;
    }

    public String makeSound(Pet pet, String sound){
        return pet.getPetName() + " is " + sound + "ing!";
    }
}
