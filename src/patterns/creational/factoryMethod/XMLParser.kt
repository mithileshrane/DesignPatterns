package patterns.creational.factoryMethod

import java.io.File

class XMLParser(file: File) :Parser{
    init {
        println("creating xml parser")
    }

    override fun parse(): List<Record> {
        println("Parsing XML values")
//        super.parse()
        return emptyList()
    }
}