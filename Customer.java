public class Customer implements Runnable{
    Bank bank;
    int threads = 5;

    int numOfResources;         //number of resources
    private int[] maximum;    //maximum demand for each customer
    private int[] request;
    private int customerNumber;

    public Customer(int customerNumber, int[] maximum, Bank bank){
        this.customerNumber = customerNumber;
        this.maximum = new int[maximum.length];
        this.bank = bank;

        

    }//end bank

    public void run(){
        
    }//end run
}
