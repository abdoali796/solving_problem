// In the popular Minesweeper game you have a board with some mines and those cells that don't contain a mine have a number in it that indicates the total number of mines in the neighboring cells. Starting off with some arrangement of mines we want to create a Minesweeper game setup.

// Example

// For

// matrix = [[true, false, false],
//           [false, true, false],
//           [false, false, false]]
// the output should be

// solution(matrix) = [[1, 2, 1],
//                     [2, 1, 1],
//                     [1, 1, 1]]


fun solution(matrix: MutableList<MutableList<Boolean>>): MutableList<MutableList<Int>> {
val result= mutableListOf<MutableList<Int>>()
val long=matrix.size
 val wth=matrix[0].size
 for (i in 0 until long)  result.add(mutableListOf())
for (x in 0 until long){
    val sub= mutableListOf<Int>()
    for (q in  0 until  wth) sub.add(0)
    for (y in 0 until wth){
        sub[y]=mines(matrix,x,y)
    }
    result[x]=sub
}

return result
}
private fun mines(matrix: MutableList<MutableList<Boolean>> ,s:Int,u:Int):Int{
    var count=0
    val matrixLong=matrix.size-1
    val matrixWith=matrix[0].size-1

   val l = if (s-1>=0) s-1 else 0
   val l2 =if (s+1 <= matrixLong) s+1 else matrixLong
    val r =if (u-1 >=0) u-1 else 0
    val r2=if(u+1 <=matrixWith) u+1 else matrixWith

   try {

    for (x in l ..  l2){
        for (y in r ..  r2){

            if(matrix[x][y] && (!(x==s && y==u)))count++
        }
    }}catch (e:Exception){ println("  $e  S$s u$u")
   }
    return count
}
