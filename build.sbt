organization in ThisBuild := "com.acme"

name := "sampleapp"

version in ThisBuild := "0.1.0-SNAPSHOT"

scalaVersion in ThisBuild := "2.10.2"

scalacOptions in (ThisBuild, Compile) ++= Seq(
  "-unchecked",
  "-deprecation",
  "-feature"
)
