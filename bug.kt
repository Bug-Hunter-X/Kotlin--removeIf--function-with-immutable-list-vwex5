fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it % 2 == 0 }
    println(list) // Output: [1, 3, 5]

    val list2 = listOf(1, 2, 3, 4, 5)
    // list2.removeIf { it % 2 == 0 } // This line will cause a compile-time error
    println(list2) // Output: [1, 2, 3, 4, 5]
}