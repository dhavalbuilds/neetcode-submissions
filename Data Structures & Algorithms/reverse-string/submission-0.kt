class Solution {
    fun reverseString(s: CharArray) : Unit {

     /* 
     // Stack : TC O(n) | SC O(n)
        val stack = ArrayDeque<Char>()
        for(char in s){
            stack.add(char)

            println("char pushed is $char")
        }

        var i = 0
        while(!stack.isEmpty()){
            val char = stack.removeLast()
             println("char popped is $char")
            s[i++] = char
        }

*/

        // 2 pointer - TC O(n) | SC O(1)
        var left = 0
        var right = s.size - 1

        while(left < right){
            s[left] = s[right].also{s[right] = s[left]}

            left++
            right--
        }    

    }
}