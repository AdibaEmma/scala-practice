import objectOriented.Person

object Tests extends App{
  val countries = List("UK","France", "Spain", "Portugal")
  val capitals = Map("UK" -> "London","France" -> "Paris", "Spain" -> "Madrid")
  println(countries.flatMap(capitals.get))

  println(getClassAsString('A'))
  def getClassAsString(x: Any):String = x match {
    case s: String => s + " is a String"
    case c: Char => c + " is a character"
    case i: Int => "Int"
    case f: Float => "Float"
    case l: List[_] => "List"
    case p: Person => "Person"
    case _ => "Unknown"
  }

  val x = for (i <- 1 to 5) yield i*i
  println(x)

  val fruits = List("apple", "banana", "lime", "orange")

  val fruitLengths = for {
    f <- fruits
    if f.length > 4
  } yield f.length

  println(fruitLengths)
}
