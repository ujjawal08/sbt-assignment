name := "sbt-assignment"

version := "0.1"

scalaVersion := "2.13.6"
lazy val common = project.in(file("common"))

  .settings {
    libraryDependencies += "org.json4s" %% "json4s-native" % "4.0.3"
    libraryDependencies += "org.slf4j" % "slf4j-log4j12" % "2.0.0-alpha4" % Test
    libraryDependencies += "puppetlabs" % "typesafe-config" % "0.2.0"
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % Test
    libraryDependencies += "org.mockito" %% "mockito-scala-scalatest" % "1.16.37" % Test
  }
lazy val persistence = project.in(file("persistance"))
  .settings {
      libraryDependencies += "com.typesafe.slick" %% "slick" % "3.3.3"
      libraryDependencies += "org.postgresql" % "postgresql" % "42.2.23"
      libraryDependencies += "com.h2database" % "h2" % "1.4.200" % Test
  }
lazy val root = project.in(file(".")).aggregate(common,persistence)

