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
        MidPriorityConcrete m = new MidPriorityConcrete();
        m.setExpireDay(LocalDate.now().plusMonths(1).toString());
        m.setStatus(RequestStatus.ACCEPTED);
        m.setPriority(RequestPriority.MEDIUM);
        return m;
    }
}
