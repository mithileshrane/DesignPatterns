package patterns.creational.factoryMethod

import java.io.File

class XMLBatchProcessor : BatchProcessor() {
    override fun createParser(file: File): Parser? {
        return XMLParser(file)
    }

}