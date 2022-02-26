package HW5.Task2;

import HW5.Task2.Guitar;

public class Test {
    public static void main(String[] args) {
        Guitar guitar=new Guitar(35);
        guitar.play();
        Drum drum = new Drum(80);
        drum.play();
        Trambone trambone=new Trambone(60);
        trambone.play();
    }



}
