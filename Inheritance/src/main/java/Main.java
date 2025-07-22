public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", "Huge", 400);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");

        Dog yorkie = new Dog("Yorkie", 15);
        doAnimalStuff(yorkie, "fast");

        Dog retriever = new Dog("Labrador Retriever", 65, "Floppy", "Swimmer");
        doAnimalStuff(retriever, "slow");

        Dog wolf = new Dog("Wolf", 40);
        doAnimalStuff(wolf, "slow");

        Fish goldie = new Fish("Goldfish", 0.25, 2, 3);
        doAnimalStuff(goldie, "fast");
    }

    // This method is not "aware" of sub-classes i.e. Dog, Fish
    // (Polymorphism)
    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        // When animal is passed in, it animal is a dog
        // then toString() is called off of dog
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }
}
