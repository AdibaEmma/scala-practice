package objectOriented

import java.time.LocalDateTime
import java.time.LocalDateTime.now
import scala.collection.mutable

class Trade (val ID: Int, val symbol: String, val quantity: Int, var initialPrice: Double, val tradeTimeStamp: LocalDateTime = now()) {
  assert(initialPrice > 0, "price is not valid")
  val ids: mutable.Set[Integer] = mutable.Set()
  private var _price = initialPrice //initialPrice is constructor parameter
  def price: Double = _price //getter method
  def price_=(value: Double): Unit = if (value >= 0) _price = value else throw new NegativePriceException("Price cannot be negative")//setter method

  def value: Double = price * quantity

  override def toString = s"Trade($ID, $symbol, $quantity, $price, $tradeTimeStamp)"
}

object Trade {
  def apply(id: Int, symbol: String, quantity: Int,initialPrice: Double): Any = {
    val ids: mutable.Set[Integer] = mutable.Set()
    if (initialPrice < 0) throw new NegativePriceException(s"Error: Price cannot be negative, check price $initialPrice")
    if (quantity < 0 || quantity > 30) throw new TradeQuantityException(s"Error: Trade quantity should be greater than 0 and 30 max")

    if (ids.contains(id)) throw new TradeIDException(s"Error: ID $id already exists!")
    ids.add(id)
    new Trade(id: Int, symbol = symbol: String, quantity: Int, initialPrice: Double)
  }
}

//case class TradeCase (val ID: Int, val symbol: String, val quantity: Int, var initialPrice: Double = 0.00)
