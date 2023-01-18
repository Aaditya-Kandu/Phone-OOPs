public interface Phone {

    void powerOn();
    void callNumber(String phoneNO);
    void receiverCall(String phoneNo);
    boolean answerCall();
    boolean isRinging();
}
