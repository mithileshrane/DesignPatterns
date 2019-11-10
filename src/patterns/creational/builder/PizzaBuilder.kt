package patterns.creational.builder

import java.text.SimpleDateFormat
import java.util.*

@PizzaDsl
class PizzaBuilder {
    private val pizza:Pizza
        get() {
            TODO()
        }
    var name: String = ""
    set(value) {
        name=value
        field = value
    }

    private var dob: Date = Date()
    var dateOfBirth: String = ""
        set(value) {
            dob = SimpleDateFormat("yyyy-MM-dd").parse(value)
        }

    fun build():Pizza{
        return Pizza()
    }

}

class AddressBuilder {

    var street: String = ""
    var number: Int = 0
    var city: String = ""


}