package objectOriented

case class TradeIDException(str: String) extends Exception{
  override def getMessage: String = super.getMessage
}
