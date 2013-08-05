package com.acme

import akka.actor._
import scala.concurrent.duration._

object SampleApp {

  /**
    * Execution entry point.
    */
  def main(args: Array[String]): Unit = {
    val system = ActorSystem("SampleApp")
    val pingActor = system.actorOf(Props[PingActor], "pingActor")
    implicit val exec = system.dispatcher
    system.scheduler.schedule(0.seconds, 1.seconds, pingActor, Ping)
  }

}
