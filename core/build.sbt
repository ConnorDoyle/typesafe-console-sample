name := "sampleapp-core"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.2.0"
)

traceAkka("2.2.0")