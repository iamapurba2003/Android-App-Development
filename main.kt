// Variables & Declearations

fun main() {
    var name = "Kotlin!" // mutable Variable Declearation
    val myName = "Apurba" // Immutable Variable Declearation
    println("Hello $myName")
}

// Initializing Variables with Types

fun main() {
    val name: String // Variables Initialize with types let's it just initialize and not pass the Value
    val age: Int
    
	name = "Apurba"
    age = 19
	println("Hello My Name is, $name. I'm $age years Old.")
}


// Basic Types of Kotlin

// Int: Holds 32 Bits
// Byte: Holds 8 Bits
// Short: Holds 16 bits
// Long: Holds 64 Bits

fun main() {
    var myByte: Byte
    myByte = 120 // This is Ok
    myByte = 127 // This is Ok too ... 
    myByte = 128 // This Overflows the limits of the Byte
    
    println("The Byte is $myByte")
    
    var myShort: Short
    myShort = 127 // This is Ok
    myShort = 129999 // This Exceeds the Limits of the Short Data Type
    println("My Short is $myShort")
}


// The Long Type

fun main () {
    val number = 1 // Just Simple stores Int 1
    val oneLong = 1L
    println("Number: $number, Long: $oneLong")
}


// Floating Point Type in Kotlin

fun main() {
    val pi= 3.14f // Now it's not Double but Float 
    val e = 2.71846854534 // This will be printed as it is
    val eFloat = 2.71846854534f // This will reduce some decimal Points and Round it off, as it's a Float
    println(e)
    println(eFloat)
}





// Operators in Kotlin

fun main() {
    val a = 23
    val b = 12
    
    println(a+b) // Yields Output of 35
    println(a/b) // Yeilds Output of 1, as dividing intergers won't give you floats so you will have to make them Floats
    
    val newA = 23.0
    val newB = 12.0
    println(newA/newB) // It Yeilds the Correct Output
    
    val x = 10
    val y = 2
    println(x%y) // Returns the Remainder of an Object
    
}













