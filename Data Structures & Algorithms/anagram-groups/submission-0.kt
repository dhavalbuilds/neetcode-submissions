class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {

        val map = mutableMapOf<String, MutableList<String>>()

        for(s in strs){
            val s_sorted = s.toCharArray().sorted().joinToString("")
            map.getOrPut(s_sorted){mutableListOf()}.add(s)
        }
        
        return map.values.toList()


    }
}

