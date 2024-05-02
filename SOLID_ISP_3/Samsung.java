public class Samsung implements Phone, BrowseWeb, Camera{

    @Override
    public void takePicture() {
        System.out.println("Taking a picture with Samsung!");
    }

    @Override
    public void browseWeb(String url) {
        System.out.println("Samsung is going to: " + url);
    }

    @Override
    public void makeCall(String number) {
        System.out.println("Samsung is calling: " + number);
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println("Samsung is sending " + number + ": " + message);
    }
    
}
