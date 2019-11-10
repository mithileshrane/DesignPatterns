package patterns.creational.factoryMethod

import java.io.File

class TextBatchProcessor :BatchProcessor(){
    override fun createParser(file: File): Parser? {
        return TextParser(file)
    }

}