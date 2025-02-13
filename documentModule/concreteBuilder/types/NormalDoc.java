package documentModule.concreteBuilder.types;

import documentModule.concreteBuilder.Document;

public class NormalDoc extends Document {

    @Override
    public void setExtension(String extension) {
        this.extension = extension;
    }

    @Override
    public void setEncryption(String encryption) {
        this.encryption = encryption;
    }

    @Override
    public void buildDoc() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buildDoc'");
    }

    @Override
    public String toString() {
        return String.format(
                "ConfidentialDoc [extension = %s, encryption = %s]\n",
                this.extension, this.encryption);
    }
}
