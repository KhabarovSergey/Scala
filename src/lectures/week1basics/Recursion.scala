package lectures.week1basics

import scala.annotation.tailrec

object Recursion extends App{
  var i = 0
  val whileVal = while (i < 3) {
    println("hello")
    i += 1
  }
  println(whileVal.getClass)
  def factorial1(n: Int): Int = {
    if (n <= 0) 1
    else n * factorial1(n - 1)
  }

  println(factorial1(3)) // выводит 6
  println("----------------------------------")
  def factorial(n: Int): Int = {
    if (n <= 0) 1
    else {
      println(s"Имеем число $n, для которого считаем факториал ${n-1}")
      var res = n * factorial(n-1)
      println(s"Вычислили факториал $n")

      res
    }
  }

  factorial(3)

  println("------------------")
  def factorialWithTailRecursion(n: Int): Int = {
    def loop(x: Int, accumulator: Int): Int = {
      if (x <= 1) accumulator
      else loop(x-1, x*accumulator)
    }

    loop(n, 1)
  }
  println("factorialWithTailRecursion=" + factorialWithTailRecursion(4))

  def repeatWord(n: Int, word: String): String = {
    def loop(x: Int, acc: String = ""): String ={
      if (x<=0) acc
      else loop(x-1, s"$word $acc")
    }

    loop(n)

  }

  println(repeatWord(3, "Scala"))


  def powerOfTwo(n: Int): BigInt = {
    @tailrec
    def loop(x: Int, acc: BigInt = 2): BigInt ={
      if (x<=1) acc
      else loop(x-1, 2*acc)
    }

    loop(n)
  }

  println("powerOfTwo = " + powerOfTwo(4))
}
