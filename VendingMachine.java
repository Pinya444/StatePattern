public class VendingMachine {
    private VendingMachineState idleState = new IdleState();
    private VendingMachineState itemSelectedState = new ItemSelectedState();
    private VendingMachineState dispensingState = new DispensingState();
    private VendingMachineState outOfOrderState = new OutOfOrderState();

    private VendingMachineState currentState;
    private int inventory = 5;

    public VendingMachine() {
        currentState = (inventory > 0) ? idleState : outOfOrderState;
    }

    // Delegation Methods
    public void selectItem() { currentState.selectItem(this); }
    public void insertCoin() { currentState.insertCoin(this); }
    public void dispense() { currentState.dispense(this); }

    // Helpers
    public void setState(VendingMachineState state) { this.currentState = state; }
    public void releaseItem() {
        if (inventory > 0) {
            inventory--;
            System.out.println("Item released! Remaining: " + inventory);
        }
    }

    // Getters for states
    public VendingMachineState getIdleState() { return idleState; }
    public VendingMachineState getItemSelectedState() { return itemSelectedState; }
    public VendingMachineState getDispensingState() { return dispensingState; }
    public VendingMachineState getOutOfOrderState() { return outOfOrderState; }
    public int getInventory() { return inventory; }
}