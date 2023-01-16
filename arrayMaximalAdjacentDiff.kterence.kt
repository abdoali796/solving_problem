/*

Given an array of integers, find the maximal absolute difference between any two of its adjacent elements.

Example

For inputArray = [2, 4, 1, 0], the output should be
solution(inputArray) = 3.
*/
fun solution(inputArray: MutableList<Int>): Int {
val diff= mutableListOf(0)
    for (i in 0 until inputArray.size) {
        if (i != 0) {
            if (inputArray[i]>=inputArray[i-1]) {
                diff.add(inputArray[i] - inputArray[i - 1])
            }else{
                diff.add(inputArray[i-1] - inputArray[i])
            }
            }
    }
   
        return diff.sorted().last()
}
