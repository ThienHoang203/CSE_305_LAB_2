package contractModule.concreteBuilder;

public class LongTermContract implements Contract {

    private String contractID;
    private String propertyID;
    private String tenantID;
    private double rentAmount;

    @Override
    public void buildContractID(String contractID) {
        this.contractID = contractID;
    }

    @Override
    public void buildPropertyID(String propertyID) {
        this.propertyID = propertyID;
    }

    @Override
    public void buildTenantID(String tenantID) {
        this.tenantID = tenantID;
    }

    @Override
    public void buildRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
    }

    @Override
    public void signContract() {
        System.out.format("enter the sign of the contract(ID: %s)\n", this.contractID);
    }

    @Override
    public String toString() {
        return String.format(
                "LongTermContract [contractID = %s, propertyID = %s, tenantID = %s, rentAmount = %f ]\n",
                contractID, propertyID, tenantID, rentAmount);

    }
}
