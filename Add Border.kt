/*Given a rectangular matrix of characters, add a border of asterisks(*) to it.

Example

For

picture = ["abc",
           "ded"]
the output should be

solution(picture) = ["*****",
                      "*abc*",
                      "*ded*",
                      "*****"]*/
fun solution(picture: MutableList<String>): MutableList<String> {
 val width=picture[0].length
 val char='*'
 val hiboder="".addCharAtIndex(char,0).repeat(width+2)

val long=picture.size
val border= mutableListOf<String>()
    for (i in 0..long+1){
        if (i==0)border.add(hiboder) else if (i==long+1)border.add(hiboder)
        else border.add(picture[i-1].addCharAtIndex(char,0).plus(char))
    }

return border
}

fun String.addCharAtIndex(char: Char, index: Int) =
    StringBuilder(this).apply { insert(index, char) }.toString() 
