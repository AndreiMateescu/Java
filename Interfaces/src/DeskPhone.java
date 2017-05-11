/**
 * Created by diamo on 05.05.2017.
 */
public class DeskPhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No action taken, desk phone does not have a power button");
    }

    @Override
    public void dial(int phoneNumer) {
        System.out.println("Now ringing " + phoneNumer + " on deskphone");
    }

    @Override
    public void answer() {
        if (isRinging){
            System.out.println("Answering te desk phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber){
            isRinging = true;
            System.out.println("Ring ring");
        }
        else
            isRinging = false;

        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
