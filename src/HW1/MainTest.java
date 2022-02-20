package HW1;


import java.util.Scanner;

public class MainTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Arithmetic arm = new Arithmetic();

        arm.x = scanner.nextInt();
        arm.setX(arm.x);
        arm.y = scanner.nextInt();
        arm.setY(arm.y);


    }
}

