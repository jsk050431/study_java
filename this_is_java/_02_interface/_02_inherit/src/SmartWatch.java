// SmartWatch.java
public class SmartWatch implements SmartDevice, WearableDevice {
    
    @Override
    public void turnOn() {
        System.out.println("Power ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Power OFF.");
    }

    @Override
    public void connectToNetwork() {
        System.out.println("Connected to network successfully.");
    }

    @Override
    public void showStatus() {
        System.out.println("SmartWatch is ready to use.");
    }
}