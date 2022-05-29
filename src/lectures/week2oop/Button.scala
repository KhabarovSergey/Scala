package lectures.week2oop

class Button(label: String) {
  def click(): String = "button -" + this.label + "- has been clicked"
  def this() = this("test")
}

class RoundedButton(label: String) extends Button(label) {
  override def click(): String ="rounded " + s"${super.click()}"
}

class TestButton(label: String) extends Button {
  override def click(): String = super.click()
}


object Test {
  def main(args: Array[String]): Unit = {
    val button = new Button("save")
    val roundedButton = new RoundedButton("bbbb")
    val testButton = new TestButton("test")
    println(button.click())
    println(roundedButton.click())
    println(testButton.click())
  }
}

/*
class Button(label: String) {
    def click(): String = s"button -$label- has been clicked"
    def this() = this("test")
}

class RoundedButton(label: String) extends Button(label) {
    override def click(): String = s"rounded ${super.click()}"
}
*/