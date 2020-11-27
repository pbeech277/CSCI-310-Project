/**
 * Bank.java
 * 
 */


public interface Bank{


    /**
     * Add a customer
     * customerNumber   -The number of the customer
     * maximumDemand    -The maximum demand for this customer
     * 
     */
    public void addCustomer(int customerNumber);

    /**
     * Output the value of available, maximum,
     * allocation, and need
     */
    public void getState();


    /**
     * Release resources
     * customerNumber   -The customer releasing resources
     * relase   -The resources being released
     */
    public void releaseResources(int customerNumber,int[] release);

    /**
     * Calculates the need
     * customerNumber -The customer requesting resource
     */
    public void calculateNeed(int customerNumber);
    
    /**
     * Checks to see if customer can get resources
     * customerNumber -The customer requesting resource
     */
    public boolean canRun(int customerNumber);
    
}//end Bank