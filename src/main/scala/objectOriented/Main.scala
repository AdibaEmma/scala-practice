package objectOriented

object Main extends App{
  try {
    val trade = Trade(1,"AAPL",30,-240.0)
    val trade2 = Trade(1,"AAPL",15,240.0)
  //  val trade2 = Trade(2,"AAPL",10,200.50)
  //  val trade3 = Trade(3,"AAPL",30,200.50)

    println(trade2)
  }
  catch {
    case tix: TradeIDException => println(tix.getMessage)
    case npx: NegativePriceException => println(npx.getMessage)
    case tqx: TradeQuantityException => println(tqx.getMessage)
    case _ => println("Something else broke")
  }
  //  val trade = TradeCase(1,"AAPL",5,200.50,now())
//  val trade2 = TradeCase(2,"AAPL",10,200.50,now())
//  val trade3 = TradeCase(3,"AAPL",30,200.50,now())

//  val tradeCopy = trade.copy()
//  println(trade.equals(tradeCopy))
//  println(trade.hashCode().equals(tradeCopy.hashCode()))
}
