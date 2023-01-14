/*
Given an array of strings, return another array containing all of its longest strings.

Example

For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
solution(inputArray) = ["aba", "vcd", "aba"]
*/
fun solution(inputArray: MutableList<String>): MutableList<String> {
    var long= 0
    for (i in 0 until inputArray.size){
        if (inputArray[i].length > long) long=inputArray[i].length
    }

val outputArray= mutableListOf<String>()
    for (i in 0 until inputArray.size){
        if (inputArray[i].length == long) outputArray.add(inputArray[i])
    }

return outputArray
}
