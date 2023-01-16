/*
Given a string, find out if its characters can be rearranged to form a palindrome.

Example

For inputString = "aabb", the output should be
solution(inputString) = true.

We can rearrange "aabb" to make "abba", which is a palindrome.*/ 
fun solution(inputString: String): Boolean {
  val n= mutableMapOf<Char,Int>()
    val a=inputString.toCharArray()
    var coun=0
   for (i in a.indices)if (!n.containsKey(a[i])) n[a[i]] = 1 else n.set(a[i],n.getValue(a[i]) + 1)
    for (i in n.values)  if (i % 2 !=0) coun++

    
 return coun <=1
}
