/*
Last night you partied a little too hard. Now there's a black and white photo of you that's about to go viral! You can't let this ruin your reputation, so you want to apply the box blur algorithm to the photo to hide its content.

The pixels in the input image are represented as integers. The algorithm distorts the input image in the following way: Every pixel x in the output image has a value equal to the average value of the pixel values from the 3 × 3 square that has its center at x, including x itself. All the pixels on the border of x are then removed.

Return the blurred image as an integer, with the fractions rounded down.
*/
fun solution(image: MutableList<MutableList<Int>>): MutableList<MutableList<Int>> {val long=image.size-2
val wth=image[0].size-2

    val blur= mutableListOf< MutableList<Int> >()
    val sub1= mutableListOf<Int>()

    for (i in  0 until long) blur.add(sub1)

    for (x in  0 until long){
        val sub= mutableListOf<Int>()
        for (i in  0 until wth) sub.add(0)

        for (y in 0 until wth) {


sub[y]=sum(image,x,y)

         blur[x]=sub
     }
blur[x]=sub
}
return blur
}
fun  sum(i: MutableList<MutableList<Int>>,x :Int, y:Int):Int{
   
   count= i[x][y]+i[x][y+1]+i[x][y+2]+i[x+1][y]+i[x+1][y+1]+i[x+1][y+2]+i[x+2][y]+i[x+2][y+1]+i[x+2][y+2]
    return count/9
}
