package HW5.Task2;

public class Guitar implements Instrument {
    private int quantityString;

    public Guitar(int quantityString) {
        this.quantityString = quantityString;
    }


    @Override
    public void play() {
        System.out.println("Играет гитара с кол-вом струн = "+ quantityString);
    }
}
