// Funtions in Kotlin

fun main() { // Main Function, Entry Point to any Kotlin Program
    sayHello(1, 10, 3, messege="is multiple of") // The Function defined Below is being Called / invoked from Here.
	sayHello(messege = "is multiple Of", multipleOf = 2) // Specifying the Arguments which are non - defaults as named Arguments
}

fun sayHello() { // A Second Function of the Program having a loop and a Print Statement
    for (i in 1..100) {
        if (i%2 == 0) {
            println("$i is a multiple of 2")
        }
    }
    print("This is a Function")
}


// Accepting Arguments

fun sayHello(first: Int, second: Int) { // Funtion accepting two parameters both of Type INT
    for (i in first..second) { // Parameters replaced as Ranges of the Loop...
        if (i%2 == 0) {
            println("$i is a multiple of 2")
        }
    }
    print("This is a Function")
}

// Accepting More Parameters and Types of Parameters in the function

fun sayHello(first: Int, second: Int, multipleOf: Int) { 
    for (i in first..second) { // Parameters replaced as Ranges of the Loop...
        if (i%multipleOf == 0) { // Replaced the Multiple of by accepting it as an Argument
            println("$i is a multiple of $multipleOf")
        }
    }
    print("This is a Function")
}

// Default & Named Arguments

fun sayHello(first: Int = 10, second: Int = 100, messege: String, multipleOf: Int) {
    for (i in first..second) { 
        if (i%multipleOf == 0) { 
            println("$i $messege $multipleOf")
        }
    }
    print("This is a Function")
}


fun calculateAge(age: Int): Int{
    val catAge = age * 7
//     print("The Cat is $catAge years Old")
	return age * 7
}

// You could also write the above function as 
fun calculateAge(age: Int): Int = age * 7 // Does the same Job in an Inline Way


fun main() {
//     println(calculateAge(10))
	val catAge = calculateAge(age = 12)
    
	if(checkAge(catAge)) // You can also escape Curly Braces in if - else is you have only one line in the Corresponding Blocks
    	print("This Cat is old ($catAge)")
    else
    	print("This Cat is Young ($catAge)")
}


// Return Boolean from Kotlin Function
fun checkAge(catAge: Int): Boolean {
    return catAge > 14
}


// Lambda functions

// normal form of a sum function
fun sum(a: Int, b: Int): Int {
    return a + b
}

 // lambda form
 val sum: (Int, Int) -> Int = { a, b -> a + b } 
 
 fun main() {
     println(sum(7, 5))
     println(catAge(7))
     showName("Apurba")
 }
 
 // lambda form of calculateCatAge function
 
 val calculateCatAge:  (Int) -> Int = { age -> age * 7 }

// Using it lambda keyword

val catAge: (Int) -> Int = { it * 7 } // It is one more form of a lambda function which has only one Parameter, it refers to the Argument you passed on to the lambda function


// Lambda function expressions that return Unit - Void

// Normal function form
fun showName(name: String) {
    println(name)
}

// lambda form

val showName: (String) -> Unit = { println(it) }

// Or

val showName: (String) -> Unit = { name -> println("My Name is $name") }


// Trailing Lambda

fun main() {
    enhancedMessege(messege = "Hello There"){ // This is a Trailing Lambda, whenenver you have a function as a Parameter and as the last parameter then you can invoke it outside the function declearation using a pair of Curly Braces. As Written here.          
        print(it)
        catAge(12)
    }
}

fun enhancedMessege(messege: String, funAsParameter: (String) -> Int) {
    println("$messege ${funAsParameter("Hey")}")
}










