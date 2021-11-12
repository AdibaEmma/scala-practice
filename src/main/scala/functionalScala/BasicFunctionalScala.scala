package functionalScala

import scala.math.pow

object BasicFunctionalScala extends App {
  val addOp = operation("power")
  println(addOp(2,10))

  def operation(arithmetic: String): (Int, Int) => Int = {
    arithmetic.toLowerCase() match {
      case "add" => add()
      case "subtract" => subtract()
      case "power" => power()
    }
  }

  def  add = () => (x: Int, y: Int) => x + y
  def  subtract = () => (x: Int, y: Int) => x - y
  def  power = () => (x: Int, y: Int) =>pow(x,y).toInt
}
