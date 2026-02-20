public class DispensingState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("Currently dispensing... please wait.");
    }

    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("Wait for current transaction to finish.");
    }

    @Override
    public void dispense(VendingMachine machine) {
        machine.releaseItem();
        if (machine.getInventory() > 0) {
            machine.setState(machine.getIdleState());
        } else {
            machine.setState(machine.getOutOfOrderState());
        }
    }
}