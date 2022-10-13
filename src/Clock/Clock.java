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
        int value = hours - 1;

        while (value < 0) {
            value += 12; // 0이거나 작은수일 경우만  while 동작. 12를 더한다.
        }

        this.hours = (byte) (value % 12 + 1);
    }

    public byte getMinutes() {
        return this.minutes;
    }

    public void setMinutes(byte minutes) {
        while (minutes < 0) {
            minutes += 60;
        }

        this.minutes = (byte) (minutes % 60);
    }

    public byte getSeconds() {
        return this.seconds;
    }

    public void setSeconds(byte seconds) {
        while (seconds<0){
            seconds+=60;
        }

        this.seconds = (byte) (seconds%60);
    }

    public void setTime(byte hours, byte minutes, byte seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }
}
