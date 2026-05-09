class Solution {

    fun encode(strs: List<String>): String {
        if (strs.isEmpty()) return ""
        var str = ""
        for(s in strs){
            str = str + "${s.length}#" + s 
        }

        return str  
    }

    fun decode(encoded: String): List<String> {
        val res = mutableListOf<String>()
        var i = 0
        while (i < encoded.length) {
            var j = i
            while (encoded[j] != '#') {
                j++
            }
            val length = encoded.substring(i, j).toInt()
            i = j + 1
            res.add(encoded.substring(i, i + length))
            i += length
        }
        return res
    }
}
