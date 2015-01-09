

import java.util.Random;

public class HasEnoughCoinState implements State {
    GumballMachine gumballMachine;
 
    public HasEnoughCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
  
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setMoney(gumballMachine.getTotalMoney()+25);
    }
    
    public void insertDime(){
        System.out.println("You inserted a Dime");
        gumballMachine.setMoney(gumballMachine.getTotalMoney()+10);
    }
 
    public void insertNickel(){
        System.out.println("You inserted a nickel");
        gumballMachine.setMoney(gumballMachine.getTotalMoney()+5);
    }
    /*
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoEnoughCoinState());
    }
    */
    public void turnCrank() {
        System.out.println("You turned...");
        gumballMachine.setState(gumballMachine.getSoldState());
        gumballMachine.setChange(gumballMachine.getTotalMoney()-50);
        gumballMachine.setMoney(0);
        
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
    public String toString() {
        return "waiting for turn of crank";
    }
}
