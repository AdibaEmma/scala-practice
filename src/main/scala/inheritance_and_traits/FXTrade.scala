package inheritance_and_traits

class FXTrade extends Trade {
  override def isExecutable(): Unit = false
}
