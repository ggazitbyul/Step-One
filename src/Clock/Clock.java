package Clock;

public class Clock {
    private byte hours = 10;
    private byte minutes = 0;
    private byte seconds = 0;

    public Clock() {

    }

    public byte getHours() {
        return this.hours;
    }

    public void setHours(byte hours) {
        this.hours = (byte) Math.min(Math.max(1,hours),12); // (1~12)1과 hours 중 큰값과, 12중 작은값을 반환.
                                                            // hours가 1보다 작은경우 무조건 1이 될거고, 12보다 값이 크면 12로 고정..
    }

    public byte getMinutes() {
        return this.minutes;
    }

    public void setMinutes(byte minutes) {
        this.minutes = (byte) Math.min(Math.max(0,minutes),59);  // (0~59) 0보단 작을수없고, 59보다 클수없다.
    }

    public byte getSeconds() {
        return this.seconds;
    }

    public void setSeconds(byte seconds) {
        this.seconds = (byte) Math.min(Math.max(0,seconds),59);  // (0~59) 0보단 작을수없고, 59보다 클수없다.
    }

    public void setTime(byte hours, byte minutes, byte seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }
}
