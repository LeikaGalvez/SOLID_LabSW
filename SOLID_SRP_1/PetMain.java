package SOLID_SRP_1;

public class PetMain {
    public static void main(String[] args) {
        Pet pet = new Pet("Whitey", "Leika");
        Eat petEat = new Eat(pet);
        MakeSound makeSound = new MakeSound(pet);

        System.out.println(petEat.eat(pet, "dog food"));
        System.out.println(makeSound.makeSound(pet, "bark"));

    }
}