package task_2

private fun main() {
    val listNumber: MutableList<Int> = mutableListOf()
    while (listNumber.size < 100) { listNumber.add((0..100).random()) }
    if (listNumber.size == 100){

        var counter = 0
        for (number in listNumber) {
            if (listNumber.count { it == number } > 1) {
                counter = listNumber.count { it == number }
                println("Элемент: $number, вхождений в массив: $counter")
            }
        }
    }
}