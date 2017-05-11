/**
 * Created by diamo on 23.04.2017.
 */
public class HealthyBurger extends Hamburger{

    private String healtyExtra1Name;
    private double healthyExtra1Price;

    private String healtyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHealthAddition1(String name, double price) {
        this.healtyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice =  super.itemizeHamburger();
        if(this.healtyExtra1Name != null){
            hamburgerPrice += this.healthyExtra1Price;
            System.out.println("Added " + this.healtyExtra1Name + " for an extra " + this.healthyExtra1Price);
        }
        if(this.healtyExtra2Name != null){
            hamburgerPrice += this.healthyExtra2Price;
            System.out.println("Added " + this.healtyExtra2Name + " for an extra " + this.healthyExtra2Price);
        }

        return hamburgerPrice;
    }

    public void addHealthAddition2(String name, double price) {
        this.healtyExtra2Name = name;
        this.healthyExtra2Price = price;
    }
}
