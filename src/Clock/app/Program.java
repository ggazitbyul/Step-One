package Clock.app;

import Clock.Clock;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
//   시,분,초 입력 받고 정제된 값 그대로 출력까지.
        Scanner scanner = new Scanner(System.in);

        System.out.println("더하거나 뺄'초'를 입력하세요 ");
        int seconds = scanner.nextInt();

        Clock test = new Clock(seconds);
        System.out.printf("%d시, %d분, %d초 입니다. %s",test.getHours(),test.getMinutes(),test.getSeconds(),System.lineSeparator());

    }
}
