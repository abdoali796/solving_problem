/*
Write a function that reverses characters in (possibly nested) parentheses in the input string.

Input strings will always be well-formed with matching ()s.

Example

For inputString = "(bar)", the output should be
solution(inputString) = "rab";
For inputString = "foo(bar)baz", the output should be
solution(inputString) = "foorabbaz";
For inputString = "foo(bar)baz(blim)", the output should be
solution(inputString) = "foorabbazmilb";
For inputString = "foo(bar(baz))blim", the output should be
solution(inputString) = "foobazrabblim".
Because "foo(bar(baz))blim" becomes "foo(barzab)blim" and then "foobazrabblim".
*/

fun solution(inputString: String): String {
     

     if (inputString == "") return ""

       var count = 0
       val enterChar = '('
       var enterPosition: Int = 0
       val outChar = ')'
       var outPosition: Int = 0
       var outStringB: String

       for (i in inputString.indices) if (inputString[i] == enterChar) count++
       for (i in inputString.indices) {
           if (inputString[i] == enterChar) enterPosition = i
           if (inputString[i] == outChar) {
               outPosition = i
               break
           }
       }
if (outPosition==0) return inputString
       val tem = inputString.subSequence(enterPosition + 1, outPosition).reversed()
       val outStringA = inputString.replaceRange(enterPosition, outPosition + 1, tem)

       if (count > 1) {
           count - 1
           outStringB = solution(outStringA)
       } else outStringB = outStringA
       return outStringB
   
 
}
