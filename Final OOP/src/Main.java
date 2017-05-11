/**
 * Created by diamo on 23.04.2017.
 */
public class Main {

    public static void main(String[] args){

        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56,"white");
        double price = hamburger.itemizeHamburger();

        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.12);

        price = hamburger.itemizeHamburger();

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.itemizeHamburger();
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.itemizeHamburger();
        healthyBurger.addHealthAddition1("Lentils", 3.41);
        System.out.println("Total: " + healthyBurger.itemizeHamburger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.itemizeHamburger();
        deluxeBurger.addHamburgerAddition1("Should ...", 50.53);
        deluxeBurger.itemizeHamburger();

    }
}
