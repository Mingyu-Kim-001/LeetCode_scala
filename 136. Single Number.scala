object Solution {
    def singleNumber(nums: Array[Int]): Int = {
        nums.groupBy(identity).filter(x => x._2.size == 1).head._1
    }
}