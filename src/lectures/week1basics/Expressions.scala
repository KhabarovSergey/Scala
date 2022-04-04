package lectures.week1basics

object Expressions extends App{
  val aVal = 1 + 2 * 3
  println(aVal)
  val aCondition = true

  val ifExpressionValue = if (aCondition) "True Condition" else "False Condition"
  println(ifExpressionValue) // выведет True Condition
  //val someVal = println("I just want to print")
  val aNumber = if (("string".length == 6 & 1 < 2) & ('1' +: "23" :+ '4').toInt == 1234)  24 else 123
  println(aNumber)
  //println("ansver :" + ('1' +: "23").toInt)
  val someVal = print("It is just a value")
  print(someVal)

  val aCodeBlock = {
    val someVal = 1
    val y = 2

    if (someVal + y > 1) true else false
  }

  println(aCodeBlock) // выводит true

  def aFunctionWithDefaultParameter(x: Int, y: String = "Default Parameter"): String = {
    s"x = $x and y = $y"
  }

  println(aFunctionWithDefaultParameter(1)) // выводит x = 1 and y = Default Parameter

  def callByValue(x: Long): Unit = {
    println(s"call by value: x1 = $x")
    println(s"call by value: x2 = $x")
  }

  def callByName(x: => Long): Unit = {
    println(s"call by name: x1 = $x")
    println(s"call by name: x2 = $x")
  }

  callByValue(System.nanoTime())
  callByName(System.nanoTime())

  def someFunc(): Int = 2 * someFunc() + 1
  def callSomeFunc(x: Int, y: => Int) = println(x)

  callSomeFunc(1, someFunc())

  def aBossFunction(): String = {
    def aHelperFunction(): String = "I'm here to help"

    aHelperFunction()
    //println(str.toString)
  }
  println(aBossFunction())

  def multiply(i: Int): Int = i*20


}
