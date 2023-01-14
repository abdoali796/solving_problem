/*
Ticket numbers usually consist of an even number of digits. A ticket number is considered lucky if the sum of the first half of the digits is equal to the sum of the second half.
Given a ticket number n, determine if it's lucky or not.
Example
For n = 1230, the output should be
solution(n) = true;
For n = 239017, the output should be
solution(n) = false.
*/ 

fun solution(n: Int): Boolean {
   val number=n.toString()
   val haf=number.length/2
    var f1=0
    var s2=0

    for (i in 0 until haf){
        val tem=number[i].digitToInt()
        f1 +=tem
    }

    for (i in haf until number.length){
        val tem=number[i].digitToInt()
        s2 +=tem
    }
    return f1==s2

}
