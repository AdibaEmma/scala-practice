object Monday {
  def main(args: Array[String]): Unit = {
    println("Hello Monday from Scala!")
    myFunc

    1 to 5 foreach(println(_))
  }

  def myFunc = println("Hello")
}

//val order = "A bottle of beer"
//val order2 = "A glass of wine"
