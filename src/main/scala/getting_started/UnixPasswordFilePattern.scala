package getting_started

import scala.util.matching.Regex

object UnixPasswordFilePattern extends App{
val input = "root:x:0:0:root:/root:/bin/bash"

  val unixPasswordFilePattern =  raw"[/0-9a-z]+".r
  unixPasswordFilePattern.findAllMatchIn(input) foreach( println(_))
}
