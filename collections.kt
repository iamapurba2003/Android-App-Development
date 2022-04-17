// Collections in Kotlin


fun main() {
//	Lists

    
    val myListOfNames = listOf("James", "Paul", "Rafael", "Gina")
    println(myListOfNames)
    
    // Looping through a list/Collection
    for (item in myListOfNames) {
        println("Names $item")
    }
    println()
    
    // Method 2 for looping through a Collection
    myListOfNames.forEach {
        
        println(it)
    }
    
    // Creating a Mutable List
    val myMutableList = mutableListOf(12, 34, 45, 123)
    
    // Adding a Element into a List
    myMutableList.add(214)
    
    // Removing an Element from a list using the Value
    myMutableList.remove(214)
    println(myMutableList)
    
    // Removing an Element from a list using the index
    myMutableList.removeAt(0)
    println(myMutableList)
    
    
    // Invoking Methods on List
    println("Number of Elements ${myMutableList.size}")
    
    // Getting an element using index number
	println("Second element ${myMutableList.get(1)}")
    // or
    println("Second element ${myMutableList[1]}")

	
    // Index of element two
    println("Index of element \"two\" ${myMutableList.indexOf(45)} ")
    
    // There are Other Methods in a List as well, Explore them as well.
    
    
    
    // Sets
    
    
    // Kotlin Sets & Maps Collections
    
    // Sets is a kind of collection of Unique Elements
    val mySet = setOf("US", "MZ", "AU")
    println(mySet)
    
    // Creating a Mutable Set
    val myMutableSet = mutableSetOf(1, 3, 4, 5)
    myMutableSet.add(3) // It will ignore the 3 as it contains only Unique Values and 3 is already Present there
    println(myMutableSet)
    myMutableSet.add(78) // It will accept the Argument as it is an Unique Value
    println(myMutableSet)
    
    
    
    // Maps
    
    
    val secretMap = mapOf("Up" to 1, "Down" to 2, "Left" to 3, "Right" to 4) // Maps are immutable, demands Key Value Pairs
    println(secretMap) 
    println(secretMap.keys) // Gets all the Keys of the Map
    println(secretMap.values) // Gets all the Values of the Map
    
    // Checking for Values in Map
    if ("Up" in secretMap) println("Yes is in!")
    if (4 in secretMap.values) println("Yes Value in!")
    
    // Creating Immutable Maps
	val myMutableSecretMap = mutableMapOf("One" to 1, "Two" to 2, "Three" to 3, "Four" to 4)
    myMutableSecretMap.put("Five", 5) // It pushes / adds the Value in a Map
	
    // Or
    
    myMutableSecretMap["Six"] = 6 // Assignments are most preferred way of adding elements in a Map
    println(myMutableSecretMap)
    
    
    // Initializing Lists
    val myNewList = mutableListOf<String>() // Explicitely mentioning the Type of Values a list Should have
    myNewList.add(12.toString()) // Converting an integer to a String
    myNewList.add("hey")
    for (i in 1..10) {
        myNewList.add(i, "Hey $i")
    }
    println(myNewList)
    
    
    // Creating an Empty Collection
    val empty = emptyList<String>()
    val emptySet = emptySet<Int>()
    val emptyMap = emptyMap<String, Int>()
    
    // Collection Filters
    
    val myListOfNames = listOf("James", "Paul", "Rafael", "Gina")
	val found = myListOfNames.filter {
        it == "Paul" || it.length > 4 || it.endsWith("l") || it.startsWith("R")
    }
    val found = myListOfNames.filter {
        it.startsWith("R", ignoreCase = true) && it.endsWith('L', ignoreCase = true)
    }
    println(found)

    
}











