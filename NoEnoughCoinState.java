

public class NoEnoughCoinState implements State {
    GumballMachine gumballMachine;
 
    public NoEnoughCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setMoney(gumballMachine.getTotalMoney()+25);
        if(gumballMachine.getTotalMoney()>=50){
          gumballMachine.setState(gumballMachine.getHasEnoughCoinState());
        }
    }
 
    public void insertDime(){
      System.out.println("You inserted a dime");
        gumballMachine.setMoney(gumballMachine.getTotalMoney()+10);
        if(gumballMachine.getTotalMoney()>=50){
          gumballMachine.setState(gumballMachine.getHasEnoughCoinState());
        }
    }
      
    public void insertNickel(){
        System.out.println("You inserted a nickel");
		gumballMachine.setMoney(gumballMachine.getTotalMoney()+5);
		if(gumballMachine.getTotalMoney()>=50){
		  gumballMachine.setState(gumballMachine.getHasEnoughCoinState());
		}
    }
    
    /*
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }
    */
   
    public void turnCrank() {
        System.out.println("You turned, but you only have "+gumballMachine.getTotalMoney()+" cents");
     }
 
    public void dispense() {
        int extraPay = 50 - gumballMachine.getTotalMoney();
        System.out.println("You need to pay another "+extraPay+" cents first");
    } 
 
    public String toString() {
        return "waiting for quarter";
    }
}
