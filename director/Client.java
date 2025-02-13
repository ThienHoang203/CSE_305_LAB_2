package director;

import bulder.ContractBuilder;
import concreteBuilder.Contract;

public class Client {
    public static void main(String[] args) {
        ContractBuilder builder = new ContractBuilder();
        Contract permanentContract = builder.setPermanentContract()
                .buildContractID("CI01")
                .buildPropertyID("PI01")
                .buildTenantID("TI001")
                .buildRentAmount(2000000.0)
                .signContract()
                .build();
        System.out.println(permanentContract);
    }
}
