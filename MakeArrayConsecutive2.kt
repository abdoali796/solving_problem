/*
Ratiorg got statues of different sizes as a present from CodeMaster for his birthday, each statue having an non-negative integer size. 
Since he likes to make things perfect, he wants to arrange them from smallest to largest so that each statue will be bigger than the previous one exactly
by 1. He may need some additional statues to be able to accomplish that. Help him figure out the minimum number of additional statues needed.
*/

fun solution(statues: MutableList<Int>): Int {
     var x=0
    if (statues.size==1) return x
    val m= statues.sorted()
for (i in m.indices){
    if (i!=0){
        if (
            m[i] - m[i-1]!=1
        ){
           val  c =m[i] - m[i-1]
            x += c
            x=x-1
        }
    }
}
if(x<=0) return 0 
return x
   
}
