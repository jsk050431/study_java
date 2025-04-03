// WearableDevice.java
public interface WearableDevice extends Device{
    
    @Override
    default void showStatus() {
        System.out.println("Wearable device is ready to use.");
    }
}
