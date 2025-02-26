package maintenanceRequest.ConcreteCreator;

import maintenanceRequest.ConcreteProduct.LowPriorityConcrete;
import maintenanceRequest.Creator.RequestCreator;
import maintenanceRequest.Product.RequestProduct;
import maintenanceRequest.RequestPriority;
import maintenanceRequest.RequestStatus;

import java.time.LocalDate;

public class LowPriorityConcreteCreator extends RequestCreator {
    @Override
    public RequestProduct createRequest() {
        LowPriorityConcrete creator = new LowPriorityConcrete();
        creator.setExpireDay(LocalDate.now().toString());
        creator.setStatus(RequestStatus.DONE);
        creator.setPriority(RequestPriority.IGNORE);
        return creator;
    }
}