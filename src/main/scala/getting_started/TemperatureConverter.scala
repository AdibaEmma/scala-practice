package getting_started

object TemperatureConverter {
  def main(args: Array[String]): Unit = {
    println(degreeToFahrenheit(29))

  }

  def degreeToFahrenheit(tempInCelsius: Float): Float =  (tempInCelsius * 9 / 5) + 32

}
