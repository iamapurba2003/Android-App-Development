// Loops & Branching

fun main() {
   /*
   If amount is equal to 1000, then you are Wealthy, else you are
   getting just fine
   */
    
    // Normal if - else if - else ladder
    val amount = 0
   if (amount == 1000) {
       print("You're Welathy!")
       
   } else if (amount >= 1000) {
       print("Wow ... You are Very Wealthy! ")
   }
   
    else {
       print("You are Getting By !!")
   }
    
    // when - case - else ladder, similar to Switch - Case - default in C/C++
 
    
    // Now when you want to Work with Values in Range in When  - Case - else Expression, do it this way
       when (amount) {
        100 -> print("You have 100")
        125 -> print("You are Getting There...")
        999 -> print("Really Close.")
        1000 -> print("Rich but not getting There...")
        1100 -> print("You've Made it to the Big League!!")
        in 1100..2000 -> print("Congo! - You are the Richest in the League.") // Sets a Range of the Case in which the Value is to be Determined
        !in 1..2000 -> print("Go Away Buddy, You don't belong here. Come, Let me gram you SOme Money!.") // Negate the same Condition, and just puts the Value in the Same manner as it was in the Previous Way.
        else -> {
            print("$amount is just not going to Work.")
        }
    }
    
    // for Loop
    
    for (i in 1..1000) { // Sets the Range of the Iterable in between 1 -> 1000
        if (i%3 == 0) { // Checks for the Current Number Divisibility by 3
            println("$i is divisible by 3")
        }
        else if (i%2 == 0) { // Checks for the current Number Divisibility by 2
            println("$i is multiple of 2")
        }
        else { // Executes if none of the Conditions matches.
            println("Sorry, You aren't a Member Here.")
        }
    }
    
}