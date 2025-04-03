// TV.java
public class TV implements RemoteControl{
    
    private boolean power = false;
    private int volume = 50;

    @Override
    public void turnOn() {
        power = true;
        System.out.println("TV Power ON.");
    }

    @Override
    public void turnOff() {
        power = false;
        System.out.println("TV power OFF.");
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
        System.out.println("TV is currently running.");
        System.out.println(String.format("Power: %s / Volume: %d", power?"ON":"OFF", volume));
    }
}
