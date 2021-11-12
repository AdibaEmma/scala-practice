package functionalScala

object Collections extends App{
  def remove(coll:Seq[Any], idx:Int)= coll.filter(c => c != coll.apply(idx))

  val seq: Seq[Int] = Seq(1, 2, 3, 4, 5)

  val newSeq = remove(seq,0)
  println(newSeq)

}
