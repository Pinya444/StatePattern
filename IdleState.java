public class IdleState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("Item selected. Please insert coins.");
        machine.setState(machine.getItemSelectedState());
    }

    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("Please select an item first.");
    }

    @Override
    public void dispense(VendingMachine machine) {
        System.out.println("Nothing to dispense.");
    }
}