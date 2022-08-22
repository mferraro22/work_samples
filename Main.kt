fun helloWorld(name: String) {
    println("Hello $name")
}

fun binarySearch () {
    println("Using the space bar, type in a series of integers:")
    val userList = readLine()!!.split(' ').map(String::toInt)
    val sortedUserList = userList.sorted()
    println("\nType in a number to find from a series of integers:")
    val item = readLine()!!.toInt()
    var low = 0
    var high = sortedUserList.size - 1
    var steps = 0
    var found = false
    while (low <= high) {
        val mid = (low + high) / 2
        val guess = sortedUserList[mid]
        steps++
        when {
            guess == item -> {
                println("\nFound - User Integer: $item Steps Taken: $steps")
                found = true
            }
            guess > item -> high = mid - 1
            else -> low = mid + 1
        }
        if (found)
            break
    }
    if (!found) {
        println("\nNo number found")
    }
}

//Quick sort algorithm was developed using the divide and conquer approach and it comes under comparison algorithm
//category. This is also known as partition-exchange sort. This algorithm splits the array into two sub-arrays based
//on the pivot position and performs the sort operation recursively till there is no more sub arrays exist.

fun quickSort(array: IntArray, low: Int, high: Int) {
    if(low < high) {
        val pivot: Int = partition(array, low, high)
        quickSort(array, low, pivot)
        quickSort(array, pivot + 1, high)
    }
}

fun partition(array: IntArray, low: Int, high: Int): Int {
    val pivot = array[low]
    var x: Int = low
    var y: Int = high
    while(x < y) {
        while(array[x] <= pivot && x < high) {
            x++
        }
        while(array[y] > pivot && y > low) {
            y--
        }
        if(x < y) {
            val control: Int = array[x]
            array[x] = array[y]
            array[y] = control
        }
    }
    array[low] = array[y]
    array[y] = pivot
    return y
}

fun printArray(array: IntArray) {
    val lastPos: Int = array.size - 1
    for (x in 0..lastPos) {
        val num = array[x]
        print("$num ")
    }
    println("")
}

fun removeVowels(S: String): String {
    val vowels = setOf('a', 'e', 'i', 'o', 'u')
    return S.filter { it !in vowels }
}

fun main() {
    helloWorld("World!\n")
    binarySearch()
    val array: IntArray = intArrayOf(22, 77, 55, 99, 33, 11, 66, 88, 44)
    print("\nBefore Sorting: ")
    printArray(array)
    quickSort(array, 0, array.size - 1)
    print("After Sorting: ")
    printArray(array)
    println("\nRemoved Vowels of Hello World!: ")
    println(removeVowels("Hello World!"))
}
