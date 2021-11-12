package inheritance_and_traits

import java.time.LocalDateTime
import java.time.LocalDateTime.now

class Transaction(override val ID: Int, override val symbol: String, override val price: Double,
                  override val quantity: Int,  override val tradeTimeStamp: LocalDateTime = now())
  extends EquityTrade(ID, symbol, price, quantity) with FeePayable with Taxable {

  def amount(): Double = value() + fee + ((value() + fee) * tax_rate)
}

object Transaction extends App {
  val equityTrade = new EquityTrade(1, "USD", 50.0, 2)
  println(equityTrade.toString)
  val transaction = new Transaction(1,"AAPL", 50.0,2)
  println(transaction.getClass())
}