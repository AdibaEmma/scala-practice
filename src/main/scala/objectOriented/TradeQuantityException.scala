package objectOriented

class TradeQuantityException(string: String) extends Exception{
  override def getMessage: String = string
}
