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
        this.hours = hours;
    }

    public byte getMinutes() {
        return this.minutes;
    }

    public void setMinutes(byte minutes) {
        this.minutes = minutes;
    }

    public byte getSeconds() {
        return this.seconds;
    }

    public void setSeconds(byte seconds) {
        this.seconds = seconds;
    }

    public void setTime(byte hours, byte minutes, byte seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }
}
