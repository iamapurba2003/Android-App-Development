// Introduction to OOP - Classes in Kotlin


// fun main() {
   val car = Car()
   
   // Changing / Overriding a Value of a Class
   car.color = "Blue"
   car.model = "mDF"
   
   println("Car Color: ${car.color} Model: ${car.model}")
   
}


class Car {
    var color: String = "Red"
    var model: String = "XMD"
    
    fun drive() {
        println("Drive...Vrooom")
    }
}



// Kotlin Classes and Primary Constructors


fun main() {
    val car = Car(color = "Green", model = "LLm")
    val secondCar = Car(color = "Purple", model = "XLMMLM")
    println("Car Color: ${car.color} Model: ${car.model}")
    println("Second Car Color: ${secondCar.color} Model: ${secondCar.model}")

}


class Car(color: String = "Blue", model: String = "xmlDE") { // This isn't a Parameter in a Class but a Contructor
    
    var color: String = color
    var model: String = model
    
    fun drive() {
        println("Drive...Vrooom")
    }
}

 You can also reduce the Code by explicitely mentioning that You wanto to use the Values of the Constructor 

class Car(var color: String = "Blue", var model: String = "xmlDE") { // By adding Var we mention that we will use Values of Constructor
    
    fun drive() {
        println("Drive...Vrooom")
    }
}




// The init Block
fun main() {
    val car = Car(color = "Green", model = "XMN")
    car.speed(minSpeed = 45, maxSpeed = 65)
}


class Car(var color: String, var model: String) { // By adding Var we mention that we will use Values of Constructor
    
    init {
        if (color == "Green") {
            println("Yay Green!!")
        } else {
            println("$color is not Green")
        }
    }
    
    fun speed(minSpeed: Int, maxSpeed: Int) {
        println("Min Speed: $minSpeed, Max Speed: $maxSpeed")
    }
    
    
    
    
    fun drive() {
        println("Drive...Vrooom")
    }
}





// Inheritance & Override

fun main() {
    val truck = Truck(color = "Magenta", model = "F16")
    truck.drive()
    truck.speed(minSpeed = 20, maxSpeed = 90)
}


class Truck(color: String, model: String): Car(color, model) {
    // Now let's say we want to make the speed property of truck class different 
    override fun speed(minSpeed: Int, maxSpeed: Int) {
        val fullSpeed = minSpeed * maxSpeed
        println("Truck full speed: $fullSpeed")
    }
    
    override fun drive(){
        println("Vroom ... Like a Truck!")
    }
}




open class Car(var color: String, var model: String) { // All Classes are by default Private, use open to make them Public
    
    
    open fun speed(minSpeed: Int, maxSpeed: Int) { // In order for the Child Class to Override a method we also need to put open keyword here.
        println("Min Speed: $minSpeed, Max Speed: $maxSpeed")
    }
    
    
    open fun drive() {
        println("Drive...Vrooom")
    }
}




// Introduction to Interface Classes

// What do we do when we have a Particular Event which is Common to all Types of Classes, we call an interface



// Creating Interfaces and Using It

fun main() {
    val button = Button(label = "Button")
	button.onClick(messege = "This is a Button")
    
    val superMario = Character(name = "Spuer Mario")
    superMario.onClick(messege = "This is an Actor!")
}




interface ClickEvent {
    fun onClick(messege: String) { 
        
    }
}



class Button(val label: String): ClickEvent {
    override fun onClick(messege: String) {
        println("Clikced $label and here's a messege $messege")
    }
}

class Character(val name: String): ClickEvent {
    override fun onClick(messege: String){
        println("Clikced by $name and here's a messege $messege")
    }
}



// Extension Functions

fun main() {
    println("Hello Jenny ".append("Miss"))
    val name: String = "Apurba"
    println("Anindita".removeFirstAndLast()) // This type of fucntions helps us extend and create our own functions and invoke them as if they are a part of K Kotlin Built-in library
}



fun String.append(toAppend: String): String = this.plus(toAppend) // This way we can extend possibilities of other function classes and modify them as we want it to be
fun String.removeFirstAndLast(): String = this.substring(1, this.length - 1)


// Data Classes

fun main() {
    val person = Person(name = "Apurba", lastName = "Ghosh", age = 19)
	val anindita = Person(name = "Anindita", lastName = "Ghosh", age = 18) 
    val arunodaya = Person(name = "Arunodaya", lastName = "Biswas", age = 19)
    
    val listofPeople = listOf(person, anindita, arunodaya)
    listofPeople.forEach {
        person -> println(person.age)
    }
}

data class Person(val name: String, val lastName: String, val age: Int) 




