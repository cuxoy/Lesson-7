package lesson7;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Dog simpleDog = new Dog();
        Dog bim = new Dog("Bim");
        Dog oldDog = new Dog("Bob", 15);
        Dog youngDog = new Dog("Printz", 2, "Spiz");

        Cat cat = new Cat();
        Cat simpleCat = new Cat();
        Cat whiteCat = new Cat("White");
        Cat brownCat = new Cat("Pushok", "brown");
        Cat blackCat = new Cat("Vasia", 7, "black");
        System.out.println("Dogs : ");

        dog.setName("Gek");
        System.out.println(dog.getName());
        dog.setAge(7);
        System.out.println(dog.getAge());
        dog.setKind("pitbull");
        System.out.println(dog.getKind());

        System.out.println("Cats : ");
        cat.setName("Rijik");
        System.out.println(cat.getName());
        cat.setAge(3);
        System.out.println(cat.getAge());
        cat.setColor("Mixed");
        System.out.println(cat.getColor());
    }
}
