package objectOriented
import org.scalatest.funsuite.AsyncFunSuite
class TradeTest extends AsyncFunSuite{
  val trade = new Trade(1,"AAPL",20,200.0)

  test("Trade.value") {
    assert(trade.value === 4000.0, "Did not pass test, check quantity or price value")
  }
}
