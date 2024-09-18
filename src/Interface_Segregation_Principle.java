
   /* public interface MultiFunctionPrinter {
        void print(Document document);
        void scan(Document document);
        void fax(Document document);
    }

    public class OldPrinter implements MultiFunctionPrinter {
        @Override
        public void print(Document document) {
            System.out.println("Printing document");
        }

        @Override
        public void scan(Document document) {
            throw new UnsupportedOperationException("Scan not supported");
        }

        @Override
        public void fax(Document document) {
            throw new UnsupportedOperationException("Fax not supported");
        }
    }
                 */


      /**/

// Document.java
class Document {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

 interface Printer {
    void print(Document document);
}
       // Scanner.java
 interface Scanner {
    void scan(Document document);
}
           // Fax.java
 interface Fax {
    void fax(Document document);
}
                  // SimplePrinter.java
 class SimplePrinter implements Printer {
    @Override
    public void print(Document document) {
        System.out.println("Printing document: " + document.getContent());
    }
}
            // MultiFunctionDevice.java
 class MultiFunctionDevice implements Printer, Scanner, Fax {
    @Override
    public void print(Document document) {
        System.out.println("Printing document: " + document.getContent());
    }

    @Override
    public void scan(Document document) {
        System.out.println("Scanning document: " + document.getContent());
    }

    @Override
    public void fax(Document document) {
        System.out.println("Faxing document: " + document.getContent());
    }
}
                                      // OldPrinter.java
 class OldPrinter implements Printer {
    @Override
    public void print(Document document) {
        System.out.println("Old printer printing: " + document.getContent());
    }
}
                                   // Main.java
public class Interface_Segregation_Principle{
    public static void main(String[] args) {
        Document doc = new Document("Sample Document");

        Printer simplePrinter = new SimplePrinter();
        simplePrinter.print(doc);

        Printer oldPrinter = new OldPrinter();
        oldPrinter.print(doc);

        MultiFunctionDevice multiFunctionDevice = new MultiFunctionDevice();
        multiFunctionDevice.print(doc);
        multiFunctionDevice.scan(doc);
        multiFunctionDevice.fax(doc);
    }
}
