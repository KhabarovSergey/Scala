package lectures.week1basics

object TestClass {
  def main(args: Array[String]) = {
    println("Hello\tWorld\n\n" );
//    var aString = "Scala course"
//    println(aString.take(5).toUpperCase)
//    println(aString.substring(1, 5).toUpperCase)
//    println(aString.take(6).toUpperCase)
//    println(aString.substring(0, 6).toUpperCase)
//    println(aString.substring(0, 5).toUpperCase)
//    println(aString.toUpperCase.substring(0, 5))
//    aString = aString.take(5); println(aString.toUpperCase)
    val aString = "Scala course"
    println(aString.replace("a", "").take(3).reverse)

    println('1' +: "42" :+ '3') // выводит 1423
    println('a' +: "bc" :+ 'd') // abcd
    println("ar" ++ "bc" :++ "d") // abcd

    val aStr = "42".+:('9')
    println(aStr.:+('3'))  // 1423

    val aStrr = "19".:++("74")
    println(aStrr)

    println(1 +: List(2, 3)) // List(1, 2, 3)
    println(List(1, 2) ++ List(3, 4)) // List(1, 2, 3, 4)
    println(List(1, 2) +: List(3, 4)) //List(List(1, 2), 3, 4)

      println(raw"name is some \n name")
      println(s"name is some \n name")

    val link = "https://stepik.org"
    println(s"The link is ${link.toUpperCase}")
    println(raw"The link is \t $link")
    println(link :++ "/catalog")
    //println(s"The link is $linc")
    println(s"The link is link")
    //println(link :+ '/catalog')
    println(s"The link is \t $link")
  }
}
