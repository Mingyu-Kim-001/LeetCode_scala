object Solution {
    def lengthOfLastWord(s: String): Int = {
        val splitted = s.split(" ")
        splitted.length match{
            case 0 => 0
            case _ => splitted.last.length
        }
    }
}