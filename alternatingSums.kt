/*
Several people are standing in a row and need to be divided into two teams. The first person goes into team 1, the second goes into team 2, the third goes into team 1 again, the fourth into team 2, and so on.

You are given an array of positive integers - the weights of the people. Return an array of two integers, where the first element is the total weight of team 1, and the second element is the total weight of team 2 after the division is complete
*/
fun solution(a: MutableList<Int>): MutableList<Int> {
  
    val b= mutableListOf(0,0)
for (i in 0 until a.size)
if (i %2==0){
    b[0]+=a[i]
}else{
    b[1]+=a[i]
}
    return b
}
