package design_patterns.creational.prototype;

import javax.print.attribute.standard.MediaSize;

class Dick implements Person{
    private final String NAME = "Dick";

    @Override
    public Person clone() {
        return new Dick();
    }

    @Override
    public String toString() {
        return NAME;
    }
}
