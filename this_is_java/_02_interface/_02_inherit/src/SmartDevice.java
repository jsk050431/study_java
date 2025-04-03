// SmartDevice.java
public interface SmartDevice extends Device {    

    void connectToNetwork();

    @Override
    default void showStatus() {
        System.out.println("Smart device is connected to the network.");
    }
}
