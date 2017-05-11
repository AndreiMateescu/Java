/**
 * Created by diamo on 05.05.2017.
 */
public interface ITelephone {

    public void powerOn();
    public void dial(int phoneNumer);
    public void answer();
    public boolean callPhone(int phoneNumber);
    public boolean isRinging();
}
