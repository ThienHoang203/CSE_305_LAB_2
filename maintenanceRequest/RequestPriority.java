package maintenanceRequest;

public enum RequestPriority {
    IGNORE("Ignore"),
    MEDIUM("Medium"),
    EMERGENCY("Emergency");

    private final String value;

    RequestPriority(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
