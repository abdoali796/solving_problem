/*
isIPv4Address
*/
fun solution(inputString: String): Boolean {
  try{
      
  val ip=inputString.split(".")
    val regex=Regex("0\\d")
  if (ip.size!=4) return false
    var isIp4=0
       for (i in 0..3)if (ip[i].matches(regex))return false

for (i in 0..3)   if (0 <= ip[i].toInt()&& ip[i].toInt() <= 255) isIp4 ++     
return isIp4==4
}catch(e:Exception){ 
    return false
}
}
