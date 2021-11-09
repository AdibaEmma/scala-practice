package objectOriented

class NegativePriceException(string: String) extends Exception {
  override def getMessage: String = string
}
