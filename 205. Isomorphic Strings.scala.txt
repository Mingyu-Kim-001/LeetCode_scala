import scala.collection.mutable.HashMap
object Solution {
  def isIsomorphic(s: String, t: String) = {
    var map1 = new HashMap[Char, Char]()
    var map2 = new HashMap[Char, Char]()
    (0 to s.length-1).forall(i => (map1.get(s(i)).contains(t(i)) || map1.put(s(i),t(i)) == None) && (map2.get(t(i)).contains(s(i)) || map2.put(t(i),s(i)) == None))
  }
}