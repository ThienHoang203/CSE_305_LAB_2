package maintenanceRequest.ConcreteCreator;

import maintenanceRequest.ConcreteProduct.MidPriorityConcrete;
import maintenanceRequest.Creator.RequestCreator;
import maintenanceRequest.Product.RequestProduct;
import maintenanceRequest.RequestPriority;
import maintenanceRequest.RequestStatus;

import java.time.LocalDate;

public class HighPriorityConcreteCreator extends RequestCreator {
    @Override
    public RequestProduct createRequest() {
        MidPriorityConcrete m = new MidPriorityConcrete();
        m.setExpireDay(LocalDate.now().toString());
        m.setStatus(RequestStatus.ACCEPT);
        m.setPriority(RequestPriority.EMERGENCY);
        return m;
    }
}
