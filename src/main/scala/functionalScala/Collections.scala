package functionalScala

import scala.collection.immutable

object Collections extends App{
  def remove(coll:Seq[Any], idx:Int)= coll filter(c => c != coll.apply(idx))

  val seq: Seq[Int] = Seq(1, 2, 3, 4, 5)
  val seq2 = immutable.List("one", "two", "three", "four", "five")

  val newSeq = remove(seq2,4)
  println(newSeq)

}
