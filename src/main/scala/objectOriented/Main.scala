package objectOriented

import java.time.LocalDateTime.now

object Main extends App{
  val trade = new Trade(1,"AAPL",5,200.50,now())
  val trade2 = new Trade(1,"AAPL",10,200.50,now())
  trade2.price = 400
  println()
}
