package design_patterns.creational.abstractfactory;

interface AbstractFactory<T> {
    T create(String animalType);
}
