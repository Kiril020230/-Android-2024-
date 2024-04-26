package task_1

private fun main() {
    val arrayNumbers = (1..100).toList().toMutableList()
    val duplicateNumber = (1..100).random()
    arrayNumbers.add(duplicateNumber)
    arrayNumbers.shuffle()
    arrayNumbers.toIntArray()

    for (number in arrayNumbers) {
        if (arrayNumbers.count { it == number } > 1) {
            println("Дублированный элемент в массиве: $number")
            break
        }
    }
}