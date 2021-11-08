package getting_started

import java.time.LocalDate
import java.time.format.DateTimeFormatter

object StringToDate {
  def main(args: Array[String]): Unit = {
    println(stringToDate("12/08/21"))
  }

  def stringToDate(dateString: String): LocalDate = {
    val formatter = DateTimeFormatter.ofPattern("dd/MM/yy")
    val localDate = LocalDate.parse(dateString, formatter)
    localDate
  }
}
