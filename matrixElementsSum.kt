/*
After becoming famous, the CodeBots decided to move into a new building together. Each of the rooms has a different cost, and some of them are free, but there's a rumour that all the free rooms are haunted! Since the CodeBots are quite superstitious, they refuse to stay in any of the free rooms, or any of the rooms below any of the free rooms.

Given matrix, a rectangular matrix of integers, where each value represents the cost of the room, your task is to return the total sum of all rooms that are suitable for the CodeBots (ie: add up all the values that don't appear below a 0).

Example

For

matrix = [[0, 1, 1, 2], 
          [0, 5, 0, 0], 
          [2, 0, 3, 3]]
the output should be
solution(matrix) = 9
*/

private fun solutionM(matrix: MutableList<MutableList<Int>>): Int {
    var sum = 0
    val gost = mutableListOf<Int>()
    for (i in 0 until matrix.size) {
        for (x in 0 until matrix[i].size) {
            val room = matrix[i][x]
            if (room == 0) gost.add(x)
            if (x !in gost) {
                sum += room
            }
        }
    }
    return sum
}
