package patterns.creational.factoryMethod

import java.io.File

open class TextParser(file: File):Parser {
    init {
        println("creating text parser")
    }

    override fun parse(): List<Record> {
        println("Parsing Records and creating list")
        return emptyList()
    }

}
