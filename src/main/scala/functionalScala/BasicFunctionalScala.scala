package functionalScala

import scala.math.pow

object BasicFunctionalScala extends App {
  val addOp = operation("subtract")
  println(addOp(2,4))

  def operation(arithmetic: String): (Int, Int) => Any = {
    arithmetic.toLowerCase() match {
      case "add" => add()
      case "subtract" => subtract()
      case "power" => power()
    }
  }

  def  add = () => (x: Int, y: Int) => x + y
  def  subtract = () => (x: Int, y: Int) => x - y
  def  power = () => (x: Int, y: Int) =>pow(x,y)
}
