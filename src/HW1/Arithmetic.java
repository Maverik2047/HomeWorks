package HW1;

public class Arithmetic {


    int x;
    int y;

    public void setX(int x) {
        if (x <= 0) {
            System.out.println("Вы должны ввести значение больше 0");
        } else {
            x = x;
        }

    }

    public void setY(int y) {
        if (y <= 0) {
            System.out.println("Вы должны ввести значение больше 0");
        } else {
            y = y;
        }
    }
}


