/*
Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.

Example

For inputArray = [3, 6, -2, -5, 7, 3], the output should be
solution(inputArray) = 21.

7 and 3 produce the largest product.
*/


fun solution(inputArray: MutableList<Int>): Int {
   val u= mutableListOf<Int>()
 for (i in 0 until inputArray.size){
     if (i!=0){
     val n=inputArray[i]*inputArray[i-1]
     u.add(n)
 }}
    val x=u.sorted().reversed()
    return x[0]
    
}
