package solutions.easy

object TwoSum {
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    val map = nums.zipWithIndex.toMap

    nums.indices
      .collectFirst {
        case i if map.get(target - nums(i)).exists(_ != i) =>
          Array(i, map(target - nums(i)))
      }
      .getOrElse(Array(-1, -1))
  }
}
