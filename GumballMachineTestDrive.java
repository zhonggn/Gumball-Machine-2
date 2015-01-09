

public class GumballMachineTestDrive {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        
        gumballMachine.insertDime();
        gumballMachine.turnCrank();//total is 35
        
        
        gumballMachine.insertQuarter();//total is 60
        gumballMachine.turnCrank();//change is 10

        System.out.println(gumballMachine);
    }
}
