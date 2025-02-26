package maintenanceRequest;

public enum RequestStatus {
    DONE("Done"), ACCEPTED("Accepted"), ACCEPT("Accept");

    private final String value;

    RequestStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
