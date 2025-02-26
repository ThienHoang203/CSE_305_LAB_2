package maintenanceRequest.Creator;

import maintenanceRequest.Product.RequestProduct;

public abstract class RequestCreator {


    public abstract RequestProduct createRequest();

    public void processRequest() {
        System.out.printf("Done!!!");
    }
}
