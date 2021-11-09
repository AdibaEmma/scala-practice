package objectOriented

import java.time.LocalDateTime.now

object Main extends App{
  val trade: Unit = Trade(1,"AAPL",5,200.50,now())
  val trade2: Unit = Trade(2,"AAPL",10,200.50,now())
  val trade3: Unit = Trade(2,"AAPL",10,200.50,now())
}
