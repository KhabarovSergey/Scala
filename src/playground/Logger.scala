package playground

import scala.annotation.tailrec


object TestAPP extends App {
  /*class Logger(msgNum: Int) {
    def count = msgNum
    def info(i: Int): Unit = {
      println("INFO new message " + msgNum)
      new Logger(msgNum + 1)
    }
    def print: Unit = println("count messages=" + count)
  }
  val logger = new Logger(0)
  logger.info(3)
  logger.info(3).
  //logger.info.info.info.print*/

  class Logger(val msgNum: Int = 1) {

    //def count = msgNum
    def info(): Logger = {
      println("INFO new message " + msgNum)
      new Logger(msgNum + 1)
    }

    def info(msgCount: Int): Logger = {
      @tailrec
      def loop(index: Int, logger: Logger = new Logger()): Logger = {
        if (index <= 0) this
        else loop(index - 1, logger.info())
      }

      loop(msgCount)
    }

    //def print: Unit = println("count messages=" + count)
  }

  val logger = new Logger(0)
  logger.info(5)
  //logger.info(3).print


}
