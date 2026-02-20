public class OutOfOrderState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("Machine is out of order.");
    }

    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("Machine is out of order.");
    }

    @Override
    public void dispense(VendingMachine machine) {
        System.out.println("Machine is out of order.");
    }
}