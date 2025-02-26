package maintenanceRequest.Product;

import maintenanceRequest.RequestPriority;
import maintenanceRequest.RequestStatus;

public abstract class RequestProduct {
    protected RequestPriority priority;
    protected RequestStatus status;
    protected String expireDay;

    public abstract void setPriority(RequestPriority priority);

    public abstract void setExpireDay(String expireDay);

    public abstract void setStatus(RequestStatus status);

    public abstract void processRequest();
}
