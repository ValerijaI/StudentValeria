package design_patterns.creational.abstractfactory;

class Duck implements Animal{

    @Override
    public String getAnimal() {
        return "Duck";
    }

    @Override
    public String makeSound() {
        return "Krjak";
    }
}
