/*
* Customer.java
* @author Rose, Thomas, Patrick
*/
public class Customer extends Thread{
    Bank banks;
    private int customerNumbers;

public class Customer implements Runnable{
    Bank bank;
    int threads = 5;

    public Customer(int customerNumber, Bank bank){
        banks = bank;
        customerNumbers = customerNumber;
          

    }//end bank

    /**
     * run method
     */
    public void run(){
        for(int i = 0; i < 4; i++){
            try{
                synchronized(banks){
                    banks.addCustomer(customerNumbers);           //generate request
                    banks.calculateNeed(customerNumbers);         //calculate need
                    banks.runThread(customerNumbers);
                }
                //holds resources for a random amount of time (1-5 seconds)
                int time = (int)(5*Math.random());
                Thread.sleep(time *1000);
                
                //release resources
                banks.releaseResources(customerNumbers);
            }catch(Exception e){
                System.out.println("\nException has been caught");
            }

        }

        System.out.println("Thead running");
        banks.displayFinal();
         
    }//end run
}
