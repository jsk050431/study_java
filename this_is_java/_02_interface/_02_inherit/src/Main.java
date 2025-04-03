// Main.java
public class Main {
    public static void main(String[] args) {
        // 인터페이스 타입으로 SmartWatch 객체를 참조
        Device device = new SmartWatch();
        SmartDevice smartDevice = new SmartWatch();
        WearableDevice wearableDevice = new SmartWatch();

        System.out.println("=== Device 인터페이스 테스트 ===");
        device.turnOn();
        device.showStatus();
        device.turnOff();

        System.out.println("\n=== SmartDevice 인터페이스 테스트 ===");
        smartDevice.turnOn();
        smartDevice.connectToNetwork();
        smartDevice.showStatus();
        smartDevice.turnOff();

        System.out.println("\n=== WearableDevice 인터페이스 테스트 ===");
        wearableDevice.turnOn();
        wearableDevice.showStatus();
        wearableDevice.turnOff();
    }
}
