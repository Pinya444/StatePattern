public interface VendingMachineState {
    void selectItem(VendingMachine machine);
    void insertCoin(VendingMachine machine);
    void dispense(VendingMachine machine);
}