package contractModule.director;

import contractModule.bulder.ContractBuilder;
import contractModule.concreteBuilder.PermanentContract;

public class Client {
    public static void main(String[] args) {
        ContractBuilder builder = new ContractBuilder();
        PermanentContract permanentContract = (PermanentContract) builder.setPermanentContract()
                .buildContractID("CI01")
                .buildPropertyID("PI01")
                .buildTenantID("TI001")
                .buildRentAmount(2000000.0)
                .signContract()
                .build();
        System.out.println(permanentContract);
    }
}
