package HW5.Task2;

public class Trambone implements Instrument {
    private int diametr;

    public Trambone(int diametr) {
        this.diametr = diametr;
    }

    @Override
    public void play() {
        System.out.println("Играет труба с диаметром = " + diametr);
    }
}
