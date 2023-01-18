public class Landline implements Phone{

    private String myPhoneNO;
    private boolean isRinging;
    private boolean isPowerOn;

    public String getMyPhoneNO() {
        return myPhoneNO;
    }

    public void setMyPhoneNO(String myPhoneNO) {
        this.myPhoneNO = myPhoneNO;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    public Landline(String myPhoneNO) {
        this.myPhoneNO = myPhoneNO;

        isRinging = false;
        isPowerOn = true;
    }

    @Override
    public void powerOn() {
        this.isPowerOn = true;
    }

    @Override
    public void callNumber(String phoneNo) {

        if(isPowerOn == true)
            System.out.println("You dialing the Number : " + phoneNo);
        else
            System.out.println("Your Landline is PowerOff");

        return;

    }

    @Override
    public void receiverCall(String phoneNo) {

        if(isPowerOn && myPhoneNO.equals(phoneNo)){
            this.isRinging = true;
            System.out.println("Hey your phone is ringing: " + phoneNo);
        }else {
            System.out.println("Call Not Receive");
        }
        return;

    }

    @Override
    public boolean answerCall() {
       if(isRinging == true){
           System.out.println("Answered the call");
           isRinging = false;
           return true;
       }
       return false;
    }

    @Override
    public boolean isRinging() {

        if(isRinging == true){
            System.out.println("Receive the call");
            isRinging = false;
            return true;
        }
        return false;
    }
}
