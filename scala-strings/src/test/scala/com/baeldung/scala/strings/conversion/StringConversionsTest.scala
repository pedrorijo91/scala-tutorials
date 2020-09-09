package com.baeldung.scala.strings.conversion

import org.scalatest.{Matchers, WordSpec}

class StringConversionsTest extends WordSpec with Matchers {

  "Conversion between Int and String" should {
    "work from Int to String" in {

      val i: Int = 42

      assert(i.toString == "42")
    }

    "work from well formatted String to Int" in {

      val str: String = "42"

      assert(str.toInt == 42)
    }

    "fail from incorrect String to Int" in {

      val str: String = "42a"

      assertThrows[NumberFormatException](str.toInt)
    }
  }
}
