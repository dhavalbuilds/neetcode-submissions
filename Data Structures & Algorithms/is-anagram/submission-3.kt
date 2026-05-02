class Solution {
    fun isAnagram(s: String, t: String): Boolean {

        val charMap = hashMapOf<String, Int>()

        s.toCharArray().forEach{ sChar->
            charMap[sChar.toString()]= charMap.getOrDefault(sChar.toString() , 0) + 1
        }

        t.toCharArray().forEach {tChar ->
        if(charMap.size == 0)return false
            if(charMap.getOrDefault(tChar.toString() , 0) > 1){
                charMap[tChar.toString()]= charMap.getOrDefault(tChar.toString() , 0) - 1
            } else if(charMap.getOrDefault(tChar.toString() , 0) == 1){
                charMap.remove(tChar.toString())
            }
        }

        return charMap.size == 0

    }
}
