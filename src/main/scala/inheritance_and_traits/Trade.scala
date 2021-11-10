package inheritance_and_traits

abstract class Trade (val ID: Int, var initialPrice: Double) {
  def isExecutable()


  override def toString = s"Trade($ID, $initialPrice, $isExecutable)"
}
