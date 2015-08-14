package helloworld


import com.typesafe.scalalogging.slf4j.Logger
import org.slf4j.LoggerFactory

object HelloWorld {
  val logger = Logger(LoggerFactory.getLogger(this.getClass))
  def main(args: Array[String]) {
    logger.debug("Hello World!")
    println("Hello, world!")
  }
}

class Fraction(n: Int, d: Int) {

  object Fraction {

  }
}
