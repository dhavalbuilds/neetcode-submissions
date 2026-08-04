class Solution {
    fun isPalindrome(s: String): Boolean {

        var left = 0
        var right = s.length - 1 

        while(left < right){

            while(!s[left].isLetterOrDigit()){
                if(left+1 < right){
                left++
                }else return true
            }

            while(!s[right].isLetterOrDigit()){
                if(right - 1 > left){
                right--
                }else return true
            }

            if(left < right && !s[left].equals(s[right], true) ){
                println("left ${s[left]} && right ${s[right]}")
                return false
            }

            left++
            right--
        }
        return true
    }
}
