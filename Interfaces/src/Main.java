/**
 * Created by diamo on 05.05.2017.
 */
public class Main {

    public static void main(String[] args) {
        ITelephone timsPhone;
        timsPhone = new DeskPhone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();

        timsPhone = new MobilePhone(23454);
        timsPhone.powerOn();
        timsPhone.callPhone(23454);
        timsPhone.answer();
    }
}
