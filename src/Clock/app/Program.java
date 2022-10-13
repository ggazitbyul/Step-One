package Clock.app;

import Clock.Clock;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
//   시,분,초 입력 받고 정제된 값 그대로 출력까지.
        Clock test = new Clock();
        Scanner scanner = new Scanner(System.in);

        System.out.println("'시'를 입력하세요 ");
        byte hour = scanner.nextByte();

        System.out.println("'분'를 입력하세요 ");
        byte minute = scanner.nextByte();

        System.out.println("'초'를 입력하세요 ");
        byte second = scanner.nextByte();

        test.setHours(hour);
        test.setMinutes(minute);
        test.setSeconds(second);

        System.out.printf("%d시, %d분, %d초 입니다.",test.getHours(),test.getMinutes(),test.getSeconds());

    }
}
