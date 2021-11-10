package inheritance_and_traits

import java.time.LocalDateTime
import java.time.LocalDateTime.now

class FXTrade (override val ID: Int, var price: Double, val tradeTimeStamp: LocalDateTime = now()) extends Trade(ID, price) {
  override def isExecutable(): Unit = false
}
