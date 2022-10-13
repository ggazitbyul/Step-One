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
        int wrapCount = 0;

        while (minutes < 0) {
            --wrapCount; // 마이너스경우
            minutes += 60;
        }
        wrapCount += minutes / 60;  // 플러스 경우

        this.minutes = (byte) (minutes % 60);

        if (wrapCount != 0) {
            setHours((byte) (this.hours + wrapCount));
        }
    }

    public byte getSeconds() {
        return this.seconds;
    }

    public void setSeconds(byte seconds) {
        int wrapCount = 0;

        while (seconds < 0) {
            --wrapCount;
            seconds += 60;
        }

        wrapCount += seconds / 60;

        this.seconds = (byte) (seconds % 60);
        if(wrapCount!=0){
            setMinutes((byte) (this.minutes + wrapCount));
        }
    }

    public void setTime(byte hours, byte minutes, byte seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }
}
