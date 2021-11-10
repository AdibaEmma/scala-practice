package inheritance_and_traits

import java.time.LocalDateTime
import java.time.LocalDateTime.now

class EquityTrade(override val ID: Int, var price: Double, val symbol: String, val quantity: Int, val tradeTimeStamp: LocalDateTime = now()) extends Trade (ID, price) {
  override def isExecutable(): Unit = true
}

