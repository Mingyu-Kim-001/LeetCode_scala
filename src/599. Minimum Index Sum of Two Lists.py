object Solution {
    def findRestaurant(list1: Array[String], list2: Array[String]): Array[String] = {
        val indexSum = (list1.zipWithIndex ++ list2.zipWithIndex).groupBy(_._1).filter(_._2.size > 1).map(x => (x._1, x._2.map(_._2).reduce(_+_)))
        val leastIndexSum = indexSum.minBy(_._2)._2
        indexSum.filter(_._2==leastIndexSum).map(_._1).toArray
    }
}