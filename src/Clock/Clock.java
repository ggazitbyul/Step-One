package Clock;

public class Clock {
    private int seconds = 0;

    public Clock(int seconds) {
        addSeconds(seconds);
    }

    public byte getHours() {
        int hours = this.seconds / 60 / 60;
        return hours == 0 ? 12 : (byte) hours;
    }

    public byte getMinutes() {
        return (byte) (this.seconds / 60 % 60);
    }

    public byte getSeconds() {
        return (byte) (this.seconds % 60);
    }

    public void addSeconds(int seconds) {
        final int HALF_DAY_IN_SECONDS = 60 * 60 * 12;

        int value = this.seconds + seconds;
        while (value < 0) {
            value += HALF_DAY_IN_SECONDS;

        }
        this.seconds = value % HALF_DAY_IN_SECONDS;
    }


}
