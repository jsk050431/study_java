// Radio.java
public class Radio implements RemoteControl {
    
    private boolean power = false;
    private int volume = 50;

    @Override
    public void turnOn() {
        power = true;
        System.out.println("Radio Power ON.");
    }

    @Override
    public void turnOff() {
        power = false;
        System.out.println("Radio Power OFF.");
    }

    @Override
    public void setVolume(int volume) {
        if (RemoteControl.MIN_VOLUME <= volume && volume <= RemoteControl.MAX_VOLUME) {
            this.volume = volume;
        } else {
            System.out.println("Invalid value.");
        }
    }
}
