import java.util.concurrent.atomic.LongAdder;

public class Shop extends Thread {

    LongAdder longAdder;
    String name;
    int[] earnings;

    public Shop(String name, LongAdder longAdder, int[] earnings) {
        this.name = name;
        this.longAdder = longAdder;
        this.earnings = earnings;
    }

    @Override
    public void run() {

        for (int i = 0; i < this.earnings.length; i++) {
            longAdder.add(earnings[i]);
        }
    }
}
