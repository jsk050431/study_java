// RemoteControl.java
public interface RemoteControl {

    // 상수
    public static final int MAX_VOLUME = 100;
    public static final int MIN_VOLUME = 0;

    // 추상 메소드
    void turnOn();
    void turnOff();
    void setVolume(int volume);

    // 디폴트 메소드
    default void showStatus() {
        System.out.println("Device is in standby mode.");
    }

    // 정적 메소드
    static void showGuide() {
        System.out.println("All devices should implement RemoteControl interface.");
    }
}
