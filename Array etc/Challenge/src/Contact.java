/**
 * Created by diamo on 03.05.2017.
 */
public class Contact {

    public String name;
    public String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Contact " +
                "Name: '" + name + '\t' +
                "Number" + phoneNumber;
    }

    public static Contact createContact(String name, String phoneNumber) {
        return new Contact(name,phoneNumber);
    }
}
