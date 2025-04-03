// Device.java
public interface Device {    
    
    void turnOn();
    void turnOff();

    default void showStatus() {
        System.out.println("Device is in stanby mode.");
    }
}
