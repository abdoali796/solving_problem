/*

Some people are standing in a row in a park. There are trees between them which cannot be moved. Your task is to rearrange the people by their heights in a non-descending order without moving the trees. People can be very tall!

Example

For a = [-1, 150, 190, 170, -1, -1, 160, 180], the output should be
solution(a) = [-1, 150, 160, 170, -1, -1, 180, 190].
*/ 
fun solution(a: MutableList<Int>): MutableList<Int> {
val long =a.size
    val tem= mutableListOf<Int>()
    val new= mutableListOf<Int>()
  val mutableMap= mutableMapOf<Int,Boolean>()
    for (i in 0 until a.size){
        if (a[i]==-1) {
            mutableMap[i] = false
        }else{
            mutableMap[i]=true
            tem.add(a[i])
        }
    }
    tem.sort()
        for (i in 0 until long){
        if (mutableMap[i]!!){
            new.add(tem[0])
            tem.removeAt(0)
        }else{
            new.add(-1)
        }
        }

  return new
}
