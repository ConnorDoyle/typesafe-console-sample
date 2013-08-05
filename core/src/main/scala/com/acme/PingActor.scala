package com.acme

import akka.actor.Actor

class PingActor extends Actor {
  def receive = {
    case Ping => println("Pinged at: " + System.currentTimeMillis)
  }
}