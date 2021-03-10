package design_patterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

class Factory {
    private static final Map<String, Person>prototypes = new HashMap<>();

    static {
        prototypes.put("tom", new Tom());
        prototypes.put("dick", new Dick());
        prototypes.put("harry", new Harry());
    }

    public static Optional<Person> getPrototypes(String type) {
        try {
            return Optional.of(prototypes.get(type).clone());
        } catch (NullPointerException e) {
            System.out.println("Prototype doesn't exist for " + type);
            return Optional.empty();
        }
    }
}
