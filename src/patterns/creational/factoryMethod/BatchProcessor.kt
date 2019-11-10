package patterns.creational.factoryMethod

import java.io.File

abstract class BatchProcessor {

    //    var parser-:TextParser?=null
    private var parser: Parser? = null

    fun processBatch(fileName: String, format: String) {
        val file = openFile(fileName) as File

        /*  when(format){
              "text"->{
                  parser= TextParser(file)
              }

              "csv"->{
                  parser=  CSVParser(file)
              }
          }
          parser?.also {parser->
              parser.parse().also { records->
                  processRecords(records)
                  writeSummary()
                  closeFile(file)
              }
          }*/


    }

    final fun processBatch(fileName: String) {

        val file = openFile(fileName) as File

        parser = createParser(file) //FactoryMethod

        parser?.also { parser ->
            parser.parse().also { records ->
                processRecords(records)
                writeSummary()
                closeFile(file)
            }
        }
    }

    //FactoryMethod
    abstract fun createParser(file: File): Parser?


    private fun openFile(fileName: String): File? {
        println("Opened File")
        return File("ds")
    }

    private fun processRecords(records: List<Record>) {
        println("Processing Each record..db calls etc")
    }

    private fun writeSummary() {
        println("Wrote Summary")
    }

    private fun closeFile(file: File) {
        println("File Closed")
    }
}