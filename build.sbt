name := "helloScala"

version := "1.0"

enablePlugins(JavaAppPackaging)

scalaVersion := "2.10.4"

libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging-slf4j" % "2.1.2"

libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.1.2"