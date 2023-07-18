package bridge;

public class Main {

    public static void main(String[] args) {
        Tv tv = new Tv();
        RemoteControl remote = new RemoteControl(tv);
        remote.togglePower();

        System.out.println(tv.isEnable());

        Radio radio = new Radio();
        AdvanceRemoteControl advanceRemote = new AdvanceRemoteControl(radio);
        advanceRemote.togglePower();

        System.out.println(radio.isEnable());

        advanceRemote.togglePower();

        System.out.println(radio.isEnable());
    }
}
