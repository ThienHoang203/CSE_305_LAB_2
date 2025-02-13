package documentModule.director;

import documentModule.builder.DocumentBuilder;
import documentModule.concreteBuilder.Document;
import documentModule.concreteBuilder.types.NormalDoc;

public class Client {
    public static void main(String[] args) {
        NormalDoc normalDoc = createNormalDoc();
        System.out.println(normalDoc);
    }

    public static NormalDoc createNormalDoc() {
        DocumentBuilder document = new DocumentBuilder();
        Document normalDoc = document.setNormalDoc()
                .setExtension(".txt")
                .setEncryption("none")
                .build();
        return (NormalDoc) normalDoc;
    }
}
