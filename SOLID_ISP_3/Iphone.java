public class Iphone implements Call, SMS, BrowseWeb, Camera{

    @Override
    public void takePicture() {
        System.out.println("Taking a picture with Iphone!");
    }

    @Override
    public void browseWeb(String url) {
        System.out.println("Iphone is going to: " + url);
    }

    @Override
    public void makeCall(String number) {
        System.out.println("Iphone is calling: " + number);
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println("Iphone is sending " + number + ": " + message);
    }
    
}
