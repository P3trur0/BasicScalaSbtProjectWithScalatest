package com.trevisoscalagroup.testproject

import org.scalatest.FunSuite
 
class HelloSuite extends FunSuite {
 
  test("the name is set correctly in constructor") {
    val p = Person("Barney", "Rubble") 
    assert(p.name == "Barney")
  }
 
}

