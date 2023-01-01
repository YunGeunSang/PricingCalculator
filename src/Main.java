import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 전기 요금 계산기(제어문)
        // 100kWh 이하는 kWh당 60.7원, 100kWh 초과는 125.9원, 200kWh 초과는 187.9원
        // 300kWh 초과는 280.6원, 400kWh 초과는 417.7원, 500kWh 초과는 670.6원
        // 단, 요금 계산 방식은 150kwh라면, 100kwh는 60.7원으로, 나머지 50kwh는 125.9원으로 계산한다

        // 요구사항
        // 1. 99kWh, 150kWh, 250kWh, 301kWh, 450kWh, 510kWh 사용량에 해당하는 전기 요금을 출력해주세요.

        System.out.println("=".repeat(25));
        System.out.println(" 주택용 전기요금(저압) 계산기");
        System.out.println("=".repeat(25));

        Calculator(99);
        Calculator(150);
        Calculator(250);
        Calculator(301);
        Calculator(450);
        Calculator(510);


    }

    static void Calculator(int Usage){
        double payment;
        final double PRICE_PER_0 = 60.7;
        final double PRICE_PER_100 = 125.9;
        final double PRICE_PER_200 = 187.9;
        final double PRICE_PER_300 = 280.6;
        final double PRICE_PER_400 = 417.7;
        final double PRICE_PER_500 = 670.6;


        if(Usage < 100) payment = PRICE_PER_0 * Usage;
        else if(Usage < 200) payment = PRICE_PER_0 * 100
                                     + PRICE_PER_100 * (Usage - 100);
        else if(Usage < 300) payment = PRICE_PER_0 * 100
                                     + PRICE_PER_100 * 100
                                     + PRICE_PER_200 * (Usage - 200);
        else if(Usage < 400) payment = PRICE_PER_0 * 100
                                     + PRICE_PER_100 * 100
                                     + PRICE_PER_200 * 100
                                     + PRICE_PER_300 * (Usage - 300);
        else if(Usage < 500) payment = PRICE_PER_0 * 100
                                     + PRICE_PER_100 * 100
                                     + PRICE_PER_200 * 100
                                     + PRICE_PER_300 * 100
                                     + PRICE_PER_400 * (Usage - 400);
        else payment = PRICE_PER_0 * 100
                     + PRICE_PER_100 * 100
                     + PRICE_PER_200 * 100
                     + PRICE_PER_300 * 100
                     + PRICE_PER_400 * 100
                     + PRICE_PER_500 * (Usage - 500);

        System.out.printf("%dkWh의 전기 요금은 %.1f원 입니다.\n", Usage, payment);

    }
}