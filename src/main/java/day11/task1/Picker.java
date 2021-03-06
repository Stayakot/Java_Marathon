package day11.task1;

public class Picker implements Worker {

    private int salary;
    private final int bonus = 70000;
    private boolean isPayed;
    private Warehouse object;

    public Picker(Warehouse object) {
        this.object = object;
    }

    public int getSalary() {
        return salary;
    }

    public boolean getisPayed() {
        return isPayed;
    }

    public String toString() {
        return "salary:" + salary + " isPayed:" + isPayed;
    }

    public void doWork() {
        salary += 80;
        object.incrementCountPickedOrders();
    }

    public void bonus() {
        if (object.getCountPickedOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
            return;
        }

        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }

        salary += bonus;
        isPayed = true;


    }
}
