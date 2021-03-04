package design_patterns.creational.abstractfactory;

class AnimalFactory implements AbstractFactory<Animal>{

    @Override
    public Animal create(String animalType) {
        if ("Dog".equals(animalType)) {
            return new Duck();
        }
        if ("Duck".equals(animalType)) {
            return new Duck();
        }
        return null;
    }
}
