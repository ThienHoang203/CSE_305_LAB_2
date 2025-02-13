package documentModule.builder;

import documentModule.concreteBuilder.Document;
import documentModule.concreteBuilder.types.ConfidentialDoc;
import documentModule.concreteBuilder.types.NormalDoc;

public class DocumentBuilder {
    private Document document;

    public DocumentBuilder setNormalDoc() {
        this.document = new NormalDoc();
        return this;
    }

    public DocumentBuilder setConfidentialDoc() {
        this.document = new ConfidentialDoc();
        return this;
    }

    public DocumentBuilder setExtension(String extension) {
        this.document.setExtension(extension);
        return this;
    }

    public DocumentBuilder setEncryption(String encryption) {
        this.document.setEncryption(encryption);
        return this;
    }

    public Document build() {
        return this.document;
    }
}
