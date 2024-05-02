public class BasicPhone implements Phone{

    @Override
    public void makeCall(String number) {
        System.out.println("Calling " + number);
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println("Sending " + number + ": " + message);
    }

}