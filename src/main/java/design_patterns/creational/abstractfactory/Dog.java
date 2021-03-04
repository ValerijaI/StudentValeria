package design_patterns.creational.abstractfactory;

class Dog implements Animal{
    @Override
    public String getAnimal() {
        return "Dog";
    }

    @Override
    public String makeSound() {
        return "Gav";
    }
}
