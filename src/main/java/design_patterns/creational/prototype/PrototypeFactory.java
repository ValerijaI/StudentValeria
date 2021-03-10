package design_patterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PrototypeFactory {

    private static Factory factory = new Factory();

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("tom");
        names.add("tim");
        names.add("jhon");
        names.add("harry");
        names.add("dick");

        for (String name : names) {
            Optional<Person> prototype = factory.getPrototypes(name);
            if (prototype.isPresent()) {
                System.out.println(prototype.get());
            }
        }

    }
}
