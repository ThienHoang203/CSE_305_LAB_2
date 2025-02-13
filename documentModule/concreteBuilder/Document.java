package documentModule.concreteBuilder;

public abstract class Document {
    protected String extension;
    protected String encryption;

    public String getExtension() {
        return extension;
    }

    public String getEncryption() {
        return encryption;
    }

    public abstract void setExtension(String extension);

    public abstract void setEncryption(String encryption);

    public abstract void buildDoc();

}
