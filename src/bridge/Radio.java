package bridge;

public class Radio implements Device{


    @Override
    public boolean isEnable() {
        return false;
    }

    @Override
    public void enable() {

    }

    @Override
    public void disable() {

    }

    @Override
    public Integer getVolume() {
        return null;
    }

    @Override
    public void setVolume(Integer percent) {

    }

    @Override
    public Integer getChannel() {
        return null;
    }

    @Override
    public void setChannel(Integer channel) {

    }
}
