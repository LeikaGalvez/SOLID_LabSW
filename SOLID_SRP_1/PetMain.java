package SOLID_SRP_1;

public class PetMain {
    public static void main(String[] args) {
        Pet pet = new Pet("Whitey", "Leika");
        PetEat petEat = new PetEat();
        PetSound petSound = new PetSound();

        System.out.println(petEat.eat(pet, "dog food"));
        System.out.println(petSound.makeSound(pet, "bark"));

    }
}