package design_patterns.creational.builder;

/*A customer ordering a pizza */
public class PizzaBuilderDemo {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();

        PizzaBuilder hawaiiPizzaBuilder = new HawaiianPizzaBuilder();
        PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();

        waiter.setPizzaBuilder(hawaiiPizzaBuilder);
        waiter.constructPizza();

        Pizza hawaii = waiter.getPizza();

        waiter.setPizzaBuilder(spicyPizzaBuilder);
        waiter.constructPizza();

        Pizza spicy = waiter.getPizza();

        System.out.println(hawaii);
        System.out.println(spicy);
    }
}
