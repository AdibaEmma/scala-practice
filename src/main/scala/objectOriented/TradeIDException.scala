package objectOriented

class TradeIDException(str: String) extends Exception{
  override def getMessage: String = str
}
