package com.trevisoscalagroup.testproject

object Hello extends App {
  val p = Person("Mario","Rossi")
  println("Hello from " + p.name+" "+p.surname)
}

case class Person(name: String, surname: String)
