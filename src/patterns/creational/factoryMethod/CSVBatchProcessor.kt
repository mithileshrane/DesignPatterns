package patterns.creational.factoryMethod

import java.io.File

class CSVBatchProcessor : BatchProcessor(){
    override fun createParser(file: File): Parser? {
        return CSVParser(file)
    }

}