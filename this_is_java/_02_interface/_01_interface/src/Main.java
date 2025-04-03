//Main.java
public class Main {

    public static void test(RemoteControl rc) {
        System.out.println("=============================");
        rc.turnOn();
        rc.turnOff();
        rc.setVolume(70);
        rc.setVolume(120);
        rc.setVolume(-20);
        rc.showStatus();
    }
    public static void main(String[] args) throws Exception {

        RemoteControl.showGuide();

        RemoteControl rc = new TV();
        test(rc);
        
        rc = new Radio();
        test(rc);

        
        rc = new RemoteControl() {
            private boolean power = false;
            private int volume = 50;

            @Override
            public void turnOn() {
                power = true;
                System.out.println("Speaker Power ON.");
            }

            @Override
            public void turnOff() {
                power = false;
                System.out.println("Speaker power OFF.");
            }

            @Override
            public void setVolume(int volume) {
                if (RemoteControl.MIN_VOLUME <= volume && volume <= RemoteControl.MAX_VOLUME) {
                    this.volume = volume;
                } else {
                    System.out.println("Invalid value.");
                }
            }

            @Override
            public void showStatus() {
                System.out.println("Speaker is currently running.");
                System.out.println(String.format("Power: %s / Volume: %d", power?"ON":"OFF", volume));
            }
        };
        test(rc);
    }
}
