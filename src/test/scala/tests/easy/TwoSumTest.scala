package tests.easy

import org.scalatest.funsuite.AnyFunSuite
import solutions.easy.TwoSum

class TwoSumTest extends AnyFunSuite {

  test("TwoSum should return correct indices for a valid pair") {
    assert(TwoSum.twoSum(Array(2, 7, 11, 15), 9) sameElements Array(0, 1))
  }

  test("TwoSum should return correct indices for another valid pair") {
    assert(TwoSum.twoSum(Array(3, 2, 4), 6) sameElements Array(1, 2))
  }

  test("TwoSum should handle negative numbers correctly") {
    assert(TwoSum.twoSum(Array(-3, 4, 3, 90), 0) sameElements Array(0, 2))
  }
}
