package design_patterns.creational.abstractfactory;

class demo {

    static AnimalFactory animalFactory = new AnimalFactory();

    public static void main (String [] args) {

        System.out.println(animalFactory.create("Dog").getAnimal());
        System.out.println(animalFactory.create("Dog").makeSound());
    }
}
