package lectures.week1basics

import scala.annotation.tailrec

object TestAPP {
  def main(args: Array[String]): Unit= {
    def SumToTime(x: Int, y: Int, n: Int): BigInt = {
      @tailrec
      def loop(n: Int, acc: BigInt = x): BigInt = {
        if (n <= 0) acc
        else loop(n -1, y + acc)
      }
      loop(n)
    }
    var i = SumToTime(args(0).toInt, args(1).toInt,args(2).toInt).toString().length
    while (i>0) {
      print(SumToTime(args(0).toInt, args(1).toInt,args(2).toInt))
      print(" ")
      i -= 1
    }
    //print(SumToTime(args(0).toInt, args(1).toInt,args(2).toInt));
    println("is the result" )
  }
}
