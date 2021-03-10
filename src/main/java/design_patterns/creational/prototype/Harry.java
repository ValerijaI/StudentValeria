package design_patterns.creational.prototype;

class Harry implements Person{

    private static final String NAME = "Harry";

    @Override
    public Person clone() {
        return new Harry();
    }

    @Override
    public String toString() {
        return NAME;
    }
}
