name := """play-scalaguice"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.8"

libraryDependencies ++= Seq(
  guice,
  "net.codingwell"         %% "scala-guice"                     % "4.2.2",
  "org.scalatestplus.play" %% "scalatestplus-play"              % "3.1.2" % Test
)
