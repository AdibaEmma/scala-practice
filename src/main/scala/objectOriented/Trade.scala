package objectOriented

import java.time.LocalDateTime
import java.time.LocalDateTime.now
import scala.collection.mutable

class Trade (val ID: Int, val symbol: String, val quantity: Int, var initialPrice: Double = 0.00, val tradeTimeStamp: LocalDateTime) {

  private var _price = initialPrice //initialPrice is constructor parameter
  def price: Double = _price //getter method
  def price_=(value: Double): Unit = { if (value >= 0) _price = value } //setter method

  def value: Double = price * quantity

  override def toString = s"Trade($ID, $symbol, $quantity, $price, $tradeTimeStamp)"
}

object Trade {
  val ids: mutable.Set[Integer] = mutable.Set()
  def apply(id: Int, symbol: String, quantity: Int,initialPrice: Double, localDateTime: LocalDateTime): Unit =
    if (ids.contains(id)) throw new TradeIDException("ID already exists!")
    else {
      ids.add(id)
      new Trade (id: Int, symbol: String, quantity: Int,initialPrice: Double, localDateTime: LocalDateTime)
    }
}

