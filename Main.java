public class Main {
    public static void main(String[] args) {
        // 1. Initialization
        VendingMachine machine = new VendingMachine();
        
        System.out.println("--- Starting Vending Machine Debug Trace ---");

        // 2. Test Case: Normal Flow
        // Logic: Idle -> ItemSelected -> Dispensing -> Idle
        System.out.println("\n[Action] Selecting Item...");
        machine.selectItem(); 
        
        System.out.println("\n[Action] Inserting Coin...");
        machine.insertCoin(); 
        
        System.out.println("\n[Action] Dispensing...");
        machine.dispense();

        // 3. Test Case: Invalid Action (Should be blocked by IdleState)
        System.out.println("\n[Action] Attempting to dispense while Idle...");
        machine.dispense(); 

        // 4. Test Case: Out of Order (Force empty inventory)
        // You can debug if the transition to OutOfOrder works here
        System.out.println("\n--- Testing Exhaustion ---");
        for(int i = 0; i < 5; i++) {
            machine.selectItem();
            machine.insertCoin();
            machine.dispense();
        }
    }
}
