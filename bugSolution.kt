fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it % 2 == 0 }
    println(list) // Output: [1, 3, 5]

    val list2 = listOf(1, 2, 3, 4, 5)
    val filteredList = list2.filter { it % 2 != 0 }
    println(list2) // Output: [1, 2, 3, 4, 5]
    println(filteredList) // Output: [1, 3, 5]
}