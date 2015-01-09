

public class GumballMachine implements IGumballMachine {
 
    State soldOutState;
    State noEnoughCoinState;
    State hasEnoughCoinState;
    State soldState;
 
    State state = soldOutState;
    int count = 0;
    int totalMoney = 0;
    int change = 0;
    boolean ballInSlot = false;
    
    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noEnoughCoinState = new NoEnoughCoinState(this);
        hasEnoughCoinState = new HasEnoughCoinState(this);
        soldState = new SoldState(this);

        this.count = numberGumballs;
        if  (numberGumballs > 0) {
            state = noEnoughCoinState;
        } 
    }
    
    int getTotalMoney(){//my code
        return totalMoney;
    }
    
    int getChange(){//my code
        return change;
    }
    
    void setMoney(int n){//my code
        totalMoney = n;
    }
    
    void setChange(int n){//my code
        change = n;
    }
    public void insertQuarter() {
        state.insertQuarter();
    }
 
    public void insertDime(){//my code
        state.insertDime();
    }
    
    public void insertNickel(){//my code
        state.insertNickel();
    }
    
    public boolean isGumballInSlot(){//my code
        return ballInSlot;
    }
    
    public void takeGumballFromSlot(){//my code
        ballInSlot = false;
    }
    /*
    public void ejectQuarter() {
        state.ejectQuarter();
    }
    */
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }
 
    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot and you get the change "+change);
        if (count != 0) {
            count = count - 1;
        }
        ballInSlot = true;
    }
 
    int getCount() {
        return count;
    }
 
    void refill(int count) {
        this.count = count;
        state = noEnoughCoinState;
    }

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoEnoughCoinState() {
        return noEnoughCoinState;
    }

    public State getHasEnoughCoinState() {
        return hasEnoughCoinState;
    }

    public State getSoldState() {
        return soldState;
    }
 
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
}
