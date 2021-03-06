package functionalScala
import java.io.File
object FunctionalCollectionsApp extends App {
  val filesInCurrentDirectory = new File(".").listFiles
  val nonHiddenInCurrentDirectory = filesInCurrentDirectory.filter(!_.getName.startsWith(".")).toList

  println(filesInCurrentDirectory.mkString("Array(", ", ", ")"))
  println(nonHiddenInCurrentDirectory.mkString("Array(", ", ", ")"))

  val filesList = filesInCurrentDirectory.filter(_.isFile).toList
  val directoryList = filesInCurrentDirectory.filter(_.isDirectory).toList
  println(filesList)
  println(directoryList)

  val fieAndSizePair: Unit = nonHiddenInCurrentDirectory.map(c => List(c.getName, c.length())) foreach (println(_))
  println(fieAndSizePair)
//  println(fieAndSizePair.mkString("Array(", ", ", ")"))

val sortedFiles: Unit = nonHiddenInCurrentDirectory.filter(_.isFile).sortWith((a, b)=> a.length() > b.length()).take(10) foreach(c => println(c,c.length()))
  println(sortedFiles)
}
