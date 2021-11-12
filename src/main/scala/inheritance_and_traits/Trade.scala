package inheritance_and_traits

abstract class Trade (val ID: Int, val price: Double) {
  def isExecutable(): Unit
  def value(): Double

  override def toString = s"Trade($ID, $price, $isExecutable)"
}
