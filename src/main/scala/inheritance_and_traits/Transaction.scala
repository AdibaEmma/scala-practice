package inheritance_and_traits

import java.time.LocalDateTime
import java.time.LocalDateTime.now

class Transaction(override val ID: Int, override val symbol: String, override var price: Double,
                  override val quantity: Int, amount: Double,  override val tradeTimeStamp: LocalDateTime = now()) extends EquityTrade(ID, symbol, price, quantity) {
def amount(): Double = amount
}
