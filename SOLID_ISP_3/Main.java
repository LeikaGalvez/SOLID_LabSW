public class Main {
    public static void main(String[] args) {
        BasicPhone basicPhone = new BasicPhone();
        basicPhone.makeCall("111111111");
        basicPhone.sendSMS("111111111", "Hello!!!!!!!!!!");

        System.out.println("-------------------------");

        Samsung samsung = new Samsung();
        samsung.makeCall("222222222");
        samsung.sendSMS("222222222", "Hello samsung~");
        samsung.browseWeb("https://college.neu.edu.ph/");
        samsung.takePicture();

        System.out.println("-----------------------------");
        
        Iphone iphone = new Iphone();
        iphone.makeCall("3333333333");
        iphone.sendSMS("33333333", "Hello ios!");
        iphone.browseWeb("https://college.neu.edu.ph/");
        iphone.takePicture();
    }
}