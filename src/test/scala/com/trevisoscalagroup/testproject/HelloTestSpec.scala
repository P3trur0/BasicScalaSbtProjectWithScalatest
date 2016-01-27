package com.trevisoscalagroup.testproject

import org.scalatest.Matchers
import org.scalatest.FlatSpec

class HelloTestSpec extends FlatSpec with Matchers {
  
  it should "properly display a name value" in {
    val p = Person("Mario","Rossi")
    
    p.name shouldBe "Mario"
    
  }
  
}