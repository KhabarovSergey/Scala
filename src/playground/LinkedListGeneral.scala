package playground

import playground.LinkedList1.LogList

import scala.annotation.tailrec

object LinkedListGeneral extends App{

  abstract sealed class LogList[+A] {
    def last: A
    def previous: LogList[A]
    def isEmpty: Boolean
    def all: String
    def add[B >: A](msg: B): LogList[B] = new Log(msg, this)
    override def toString: String = "" + last + " "
  }

  class Log[+A](override val last: A, override val previous: LogList[A]) extends LogList[A] {
    override def isEmpty: Boolean = false

    override def all: String = {
      @tailrec
      def iter(rest: LogList[A], acc: String): String = {
        if (rest.isEmpty) acc.toString else iter(rest.previous, s"${acc.toString} ${rest.last}".toString)
      }

      iter(previous, last.toString)
    }
  }

  object Empty extends LogList[Nothing] {
    override def last: Nothing = throw new NoSuchElementException

    override def previous: Nothing = throw new NoSuchElementException

    override def isEmpty: Boolean = true

    override def all: String = ""
  }

  println(new Log("m1", new Log("m2", new Log("m3", Empty))).all )
}
