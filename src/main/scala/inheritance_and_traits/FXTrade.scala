package inheritance_and_traits

import java.time.LocalDateTime
import java.time.LocalDateTime.now

class FXTrade (override val ID: Int, override val price: Double, val tradeTimeStamp: LocalDateTime = now()) extends Trade(ID, price) {
  override def isExecutable(): Unit = false

  override def value(): Double = ???
}
