package maintenanceRequest;

import maintenanceRequest.ConcreteCreator.HighPriorityConcreteCreator;
import maintenanceRequest.ConcreteCreator.LowPriorityConcreteCreator;
import maintenanceRequest.ConcreteCreator.MidPriorityConcreteCreator;
import maintenanceRequest.ConcreteProduct.LowPriorityConcrete;
import maintenanceRequest.Creator.RequestCreator;
import maintenanceRequest.Product.RequestProduct;

public class Main {
    public static void main(String[] args) {
        System.out.println("&&&&&&&&&&&&");
        RequestCreator reqFactory;
        RequestProduct reqProd;

        reqFactory = new LowPriorityConcreteCreator();
        reqProd = reqFactory.createRequest();
        reqProd.processRequest();

        reqFactory = new MidPriorityConcreteCreator();
        reqProd = reqFactory.createRequest();
        reqProd.processRequest();

        reqFactory = new HighPriorityConcreteCreator();
        reqProd = reqFactory.createRequest();
        reqProd.processRequest();

        System.out.println("&&&&&&&&&&&&");
    }
}
