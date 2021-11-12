package inheritance_and_traits

import java.time.LocalDateTime
import java.time.LocalDateTime.now

class EquityTrade(override val ID: Int, val symbol: String, override val price: Double, val quantity: Int, val tradeTimeStamp: LocalDateTime = now()) extends Trade (ID, price) {
  override def isExecutable(): Unit = true


  override def toString: String = super.toString

  override def value(): Double = price * quantity
}

