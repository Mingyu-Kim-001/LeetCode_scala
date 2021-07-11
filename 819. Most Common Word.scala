object Solution {
    def mostCommonWord(paragraph: String, banned: Array[String]): String = {
        paragraph.map(c => if (c.isLetter) c.toLower else ' ' )
          .split(' ')
          .filter(w => !banned.contains(w) && w.length>0)
          .groupMapReduce(identity)(x => 1)(_ + _)
          .maxBy(_._2)
          ._1
    }
}