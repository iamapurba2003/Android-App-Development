// Introduction to Generics


// fun main() {
   
// 	val listOfItems = listOf("Rafael", "Gina", "George", "James")    
//     val finder = Finder(list = listOfItems)
//     finder.findItem(element = "Gina") { // Invoking of Trailing Lambda
//         println("Found $it")
//     }
// }



// class Finder(private val list: List<String>) { // The private keyword makes it a provate variable
//     fun findItem(element: String, foundItem: (element: String?) -> Unit) {
//         val itemFoundList = list.filter {
//             it === element
//         }
        
//         if(itemFoundList.isNullOrEmpty()) foundItem(null) else
//         foundItem(itemFoundList.first())
//     }
// }

// Generics

// fun main() {
   
// 	val listOfItems = listOf("Rafael", "Gina", "George", "James")  
//     val listOfNumbers = listOf(23, 45, 45)
//     val finder = Finder(list = listOfNumbers)
//     finder.findItem(element = 233) { // Invoking of Trailing Lambda
//         println("Found $it")
//     }
// }



// class Finder<T>(private val list: List<T>) { // The private keyword makes it a provate variable
//     fun findItem(element: T, foundItem: (element: T?) -> Unit) {
//         val itemFoundList = list.filter {
//             it === element
//         }
        
//         if(itemFoundList.isNullOrEmpty()) foundItem(null) else
//         foundItem(itemFoundList.first())
//     }
// }



// Intoduction to Enums and State

// fun main() {
    
// //     val input = Result.ERROR
// //     getResult(result = input)

//     Repository.startFetch()
//     getResult(result = Repository.getCurrentState())
//     Repository.finishedFetch()
//     getResult(result = Repository.getCurrentState())
//     Repository.error()
//     getResult(result = Repository.getCurrentState())
   
    
    
// }

// // A Way so that a Certain Class cannot make many instances of itself ...

// object Repository {
//     private var loadState: Result = Result.IDLE
//     private var dataFetched: String? = null
//     fun startFetch() {
//         loadState = Result.LOADING
//         dataFetched = "data"
//     }
    
//     fun finishedFetch() {
//         loadState = Result.SUCCESS
//         dataFetched = null
//     }
    
//     fun error() {
//         loadState = Result.ERROR
//     }
    
//     fun getCurrentState(): Result {
//         return loadState
//     }
// }



// fun getResult(result: Result) {
//     return when(result) {
//         Result.SUCCESS -> println("Success!")
//         Result.FAILURE -> println("Failure!!")
//         Result.ERROR -> println("Error!")
//         Result.IDLE -> println("Idle!!")
//         Result.LOADING -> println("Loading... ")
//     }
// }

// enum class Result {
//     SUCCESS,
//     FAILURE,
//     ERROR,
//     IDLE,
//     LOADING
// }



// Improving Enums - Sealed Classes

fun main() {
    
//     val input = Result.ERROR
//     getResult(result = input)

    Repository.startFetch()
    getResult(result = Repository.getCurrentState())
    Repository.finishedFetch()
    getResult(result = Repository.getCurrentState())
    Repository.error()
    getResult(result = Repository.getCurrentState())
   
}

// A Way so that a Certain Class cannot make many instances of itself ...

object Repository {
    private var loadState: Result = Result.IDLE
    private var dataFetched: String? = null
    fun startFetch() {
        loadState = Result.LOADING
        dataFetched = "data"
    }
    
    fun finishedFetch() {
        loadState = Result.SUCCESS
        dataFetched = null
    }
    
    fun error() {
        loadState = Result.ERROR
    }
    
    fun getCurrentState(): Result {
        return loadState
    }
}



fun getResult(result: Result) {
    return when(result) {
        Result.SUCCESS -> println("Success!")
        Result.ERROR -> println("Error!")
        Result.IDLE -> println("Idle!!")
        Result.LOADING -> println("Loading... ")
    }
}

enum class Result {
    SUCCESS,
    ERROR,
    IDLE,
    LOADING
}


