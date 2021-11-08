package objectOriented

import java.lang.Integer
import java.time.LocalDateTime
import java.time.LocalDateTime.now
import scala.collection.mutable

class Trade (val ID: Int, val symbol: String, val quantity: Int, var initialPrice: Double, val tradeTimeStamp: LocalDateTime) {

  val ids: mutable.Set[Integer] = mutable.Set()

  if (ids.contains(ID)) throw TradeIDException("ID already exists!")
  else ids.add(ID)

  private var _price = initialPrice //initialPrice is constructor parameter
  def price: Double = _price //getter method
  def price_=(value: Double): Unit = { if (value >= 0) _price = value } //setter method

  def value: Double = price * quantity
  def fetchIds: mutable.Set[Integer] = ids
  def getId: Int = ID

  def symbols: String = symbol

  def getQuantity: Int = quantity

  def getPrice: Double = price

  def getTradeTimeStamp: LocalDateTime = tradeTimeStamp

  override def toString = s"Trade($ID, $symbol, $quantity, $price, $tradeTimeStamp)"
}

object Trade {
  new Trade(1,"AAPL",10,200.50,now())
}

