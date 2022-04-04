package lectures.week1basics

import scala.annotation.tailrec
import scala.io.StdIn.readLine

object Recursion1 extends App {
  print("Enter your string: ")
  val mystring = readLine()
  var arr: Array[String] = mystring.split("\\s+")

  def StringRevers(s:String): String ={
    val Arr: Array[String] = s.replaceAll(raw"\s+", " ").split(" ")
    @tailrec
    def loop(k: Int, acc: String = ""): String = {
      if (k <= 0) acc else loop(k - 1, acc + Arr(k -1) + " ")
    }
    loop(Arr.length)
  }
}
