package patterns.creational.factoryMethod

import java.io.File

class CSVParser(file:File): Parser {

    init {
        println("creating csv parser")
    }

    override fun parse(): List<Record> {
        println("Parsing CSV values")
//        super.parse()
        return emptyList()
    }

}