public class ItemSelectedState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("Item already selected.");
    }

    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("Coin accepted.");
        // Logic for balance check could go here
        machine.setState(machine.getDispensingState());
    }

    @Override
    public void dispense(VendingMachine machine) {
        System.out.println("Insert coins first.");
    }
}