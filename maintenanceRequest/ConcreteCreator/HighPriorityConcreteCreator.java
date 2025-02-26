package maintenanceRequest.ConcreteCreator;

import maintenanceRequest.ConcreteProduct.HighPriorityConcrete;
import maintenanceRequest.ConcreteProduct.MidPriorityConcrete;
import maintenanceRequest.Creator.RequestCreator;
import maintenanceRequest.Product.RequestProduct;
import maintenanceRequest.RequestPriority;
import maintenanceRequest.RequestStatus;

import java.time.LocalDate;

public class HighPriorityConcreteCreator extends RequestCreator {
    @Override
    public RequestProduct createRequest() {
        HighPriorityConcrete creator = new HighPriorityConcrete();
        creator.setExpireDay(LocalDate.now().toString());
        creator.setStatus(RequestStatus.ACCEPT);
        creator.setPriority(RequestPriority.EMERGENCY);
        return creator;
    }
}
