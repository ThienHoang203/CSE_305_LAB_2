package maintenanceRequest.ConcreteCreator;

import maintenanceRequest.ConcreteProduct.LowPriorityConcrete;
import maintenanceRequest.ConcreteProduct.MidPriorityConcrete;
import maintenanceRequest.Creator.RequestCreator;
import maintenanceRequest.Product.RequestProduct;
import maintenanceRequest.RequestPriority;
import maintenanceRequest.RequestStatus;

import java.time.LocalDate;

public class MidPriorityConcreteCreator extends RequestCreator {
    @Override
    public RequestProduct createRequest() {
        MidPriorityConcrete creator = new MidPriorityConcrete();
        creator.setExpireDay(LocalDate.now().plusMonths(1).toString());
        creator.setStatus(RequestStatus.ACCEPTED);
        creator.setPriority(RequestPriority.MEDIUM);
        return creator;
    }
}
