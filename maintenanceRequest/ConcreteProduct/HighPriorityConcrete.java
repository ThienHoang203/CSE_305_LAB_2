package maintenanceRequest.ConcreteProduct;

import maintenanceRequest.Product.RequestProduct;
import maintenanceRequest.RequestPriority;
import maintenanceRequest.RequestStatus;

public class HighPriorityConcrete extends RequestProduct {
    @Override
    public void setPriority(RequestPriority priority) {
        this.priority = priority;
    }

    @Override
    public void setExpireDay(String expireDay) {
        this.expireDay = expireDay;
    }

    @Override
    public void setStatus(RequestStatus status) {
        this.status = status;
    }

    @Override
    public void processRequest() {
        System.out.printf("High-Priority Request [priority = %s, status = %s, expireDay: %s]\n", this.priority.getValue(), this.status.getValue(), this.expireDay);
    }
}
