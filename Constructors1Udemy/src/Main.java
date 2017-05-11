/**
 * Created by diamo on 21.04.2017.
 */
public class Main {

    public static void main(String[] args) {
       /*Account bobsAccount = new Account("12345",
                0.0,
                "Andrei Radu",
                "myemail@java.com",
                "043855465");

        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100);

        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100);

        Account timsAccount = new Account("tim", "tim@email.com", "112345");
        System.out.println(timsAccount.getNumber());
        */

       VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("Andrei", 10000, "andrei.mateescu@icloud.com");
        VipPerson person3 = new VipPerson("Radu", 4000);

        System.out.println(person2.getName());
    }

}
