package objectOriented

class MaxTradeQuantityException(string: String) extends Exception{
  override def getMessage: String = string
}
