package lectures.week1basics
import scala.annotation.tailrec
import scala.io.StdIn.readLine

object FinalAPP extends App{
  print("Enter your string: ")
  val mystring = readLine()
  var arr: Array[String] = mystring.split("\\s+")


  def printOfString(str: Array[String]): String = {
    var i = str.length-1
    //val strout: Array[String] = str.reverse
    var sss = ""
    while(i>=0) {
      if(i==0) sss+=str(i)
      else sss= sss+str(i) + " "
      i -= 1
    }
    return sss
  }

  print(printOfString(arr))
}
