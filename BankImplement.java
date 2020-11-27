
public class BankImplement implements Bank{
    int numOfCustomers;         //number of customers
    int numOfResources;         //number of resources
    int minumimDemand = 1;
    int maximumDemand = 10;
    private int[] available;    //amount available for each resource
    private int[][] allocation; //amount currently allocated to each customer
    private int[][] maximum;    //maximum demand for each customer
    private int[][] need;       //remaining needs of each customer
    private int[] customerRequest;  //keep track of customer requests

    /**
     * Bank Constructor
     * @param resources
     */
    public BankImplement(int resources, int customers){
        numOfResources = resources;
        numOfCustomers = customers;

        available = new int[numOfResources];
        maximum = new int[numOfCustomers][numOfResources];
        allocation = new int[numOfCustomers][numOfResources];
        need = new int[numOfCustomers][numOfResources];
        customerRequest = new int[numOfResources];

        //radomly generate available
        for(int i = 0; i < numOfResources; i++){
            available[i] = (int)Math.round(Math.random()*(maximumDemand-minumimDemand)+minumimDemand);
        }

        //ramdomly generate maximum
        for(int i = 0; i < numOfCustomers; i++){
            for(int j = 0; j < numOfResources; j++){
                maximum[i][j] = (int)Math.round(Math.random()*(available[j] - minumimDemand)+minumimDemand);
            }
        }

        //display whatever matrices (maximum in this case)
        for(int i = 0; i < numOfCustomers; i++){
            for(int j = 0; j < numOfResources; j++){
                System.out.print(maximum[i][j] + " ");
            }
            System.out.println();
        }


    }//end BankImplement

    /**
     * Add a customer and generate random request
     * customerNumber   -The number of the customer
     * 
     * 
     */
    public void addCustomer(int customerNumber){
        for(int i = 0; i < numOfResources; i++){
            customerRequest[i] = (int)Math.round(Math.random()*(maximum[customerNumber][i]-minumimDemand)+minumimDemand);
            allocation[customerNumber][i] = customerRequest[i];
        }
        
    }//end addCustomer

    /**
     * Output the value of available, maximum,
     * allocation, and need
     */
    public void getState(){


    }//end getState

    /**
     * Release resources
     * customerNumber   -The customer releasing resources
     * relase   -The resources being released
     */
    public synchronized void releaseResources(int customerNumber,int[] release){

    }//end releaseResources

    
    /**
     * calculateNeed
     * Checks to see if customer can get resources
     * customerNumber -The customer reuqesting resource
     */
    public void calculateNeed(int customerNumber){
        for(int i = 0; i < numOfResources; i++){
            int cusNeed = maximum[customerNumber][i] - allocation[customerNumber][i];
            need[customerNumber][i] = cusNeed = Math.abs(cusNeed);
        }
    }//end calculateNeed

    /**
     * Checks to see if customer can get resources
     * customerNumber -The customer requesting resource
     */
    public boolean canRun(int customerNumber){
        
    }

}//end BankImplement