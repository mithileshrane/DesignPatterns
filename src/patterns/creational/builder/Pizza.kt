package patterns.creational.builder

class Pizza() {
    private val toppings = mutableListOf<String>()

    var dough :String= ""
        get() = field
        set(value) {
            field = value
        }

    val name = ""
    val sauce = ""
}