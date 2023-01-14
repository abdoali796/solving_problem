fun main() {
    val sequence = mutableListOf(1, 3, 2, 1)
    println(solutiona(sequence))
}

fun solutiona(sequence: MutableList<Int>): Boolean {
    var count = 0
    val tempList = sequence
    for (i in 1 until sequence.size) {
        if (i != sequence.size - 1) {
            if (sequence[i] <= sequence[i - 1]) {
                count++
                if (i == 1) {
                    tempList.removeAt(0);break
                }
                if (sequence[i - 1] >= sequence[i + 1]) {
                    tempList.removeAt(i - 1)
                } else {
                    tempList.removeAt(i)
                }
                break
            }
        }
    }
    for (i in 1 until tempList.size) {
        if (tempList[i] <= tempList[i - 1]) {
            count++
        }
    }
    if (count >= 2) return false
    return true
}
