package bulder;

import concreteBuilder.Contract;
import concreteBuilder.LongTermContract;
import concreteBuilder.PermanentContract;
import concreteBuilder.ShortTermContract;

public class ContractBuilder {
    private Contract contract;

    public ContractBuilder setPermanentContract() {
        this.contract = new PermanentContract();
        return this;
    }

    public ContractBuilder setLongTermContract() {
        this.contract = new LongTermContract();
        return this;
    }

    public ContractBuilder setShortTermContract() {
        this.contract = new ShortTermContract();
        return this;
    }

    public ContractBuilder buildContractID(String contractID) {
        this.contract.buildContractID(contractID);
        return this;
    }

    public ContractBuilder buildPropertyID(String propertyID) {
        this.contract.buildPropertyID(propertyID);
        return this;
    }

    public ContractBuilder buildTenantID(String tenantID) {
        this.contract.buildTenantID(tenantID);
        return this;
    }

    public ContractBuilder buildRentAmount(double rentAmount) {
        contract.buildRentAmount(rentAmount);
        return this;
    }

    public ContractBuilder signContract() {
        contract.signContract();
        return this;
    }

    public Contract build() {
        return contract;
    }
}
