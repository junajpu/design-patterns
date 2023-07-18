package bridge;

public interface Device {
    public boolean isEnable();
    public void enable();
    public void disable();
    public Integer getVolume();

    public void setVolume(Integer percent);

    public Integer getChannel();
    public void setChannel(Integer channel);

}
