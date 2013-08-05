import sbt._
import Keys._

import com.typesafe.sbt.SbtAtmos.{ Atmos, atmosSettings }

object SampleAppBuild extends Build {

  lazy val root = Project(
    id = "root",
    base = file("."),
    settings = commonSettings
  ) aggregate(
    core
  )

  lazy val core = Project(
    id = "core",
    base = file("core"),
    settings = commonSettings ++ atmosSettings
  ).configs(
    Atmos
  ).settings(
    atmosSettings: _*
  )

  lazy val commonSettings = Project.defaultSettings

}
