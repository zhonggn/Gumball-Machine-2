

public class SoldOutState implements State {
    GumballMachine gumballMachine;
 
    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
    public void insertQuarter() {
        System.out.println("You can't insert a quarter, the machine is sold out");
    }
    
    public void insertDime(){// I added it
       System.out.println("You can't insert a Dime, the machine is sold out");
    }
 
    public void insertNickel(){//I added it
         System.out.println("You can't insert a Nickel, the machine is sold out");
    }
    
    /*
    public void ejectQuarter() {//I delete this method
        System.out.println("You can't eject, you haven't inserted a quarter yet");
    }
    */
 
    public void turnCrank() {
        System.out.println("You turned, but there are no gumballs");
    }
 
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
    public String toString() {
        return "sold out";
    }
}
