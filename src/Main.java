import java.util.concurrent.atomic.LongAdder;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        LongAdder longAdder = new LongAdder();
        Thread shop1 = new Shop("Шестёрочка", longAdder, new int[]{100, 200, 300, 400});
        Thread shop2 = new Shop("Трикотаж Бельгийский", longAdder, new int[]{500, 300, 200});
        Thread shop3 = new Shop("Просрочка", longAdder, new int[]{200, 200, 200, 200, 200});

        shop1.start();
        shop2.start();
        shop3.start();

        Thread.sleep(1000);

        System.out.println("Общая выручка магазинов: " + longAdder.sum() + " рублей");
    }
}
