package patterns.creational.factoryMethod;

public class RunCode {
    public static void main(String[] args) {
        BatchProcessor batchProcessor = createBatchProcessor("csv");
        batchProcessor.processBatch("File");
        System.out.println("Done");
    }

    private static BatchProcessor createBatchProcessor(String file) {
      // Static Fatctory Method

        switch (file) {
            case "text": {
                return new TextBatchProcessor();
            }

            case "csv": {
                return new CSVBatchProcessor();
            }

            case "xml": {
                return new XMLBatchProcessor();
            }

            default: return null;
        }
    }
}
