class Solution {
    fun validPalindrome(s: String): Boolean {

        var left = 0
        var right = s.length - 1 

        var deletionCount = 0

        while(left < right){

            if(!s[left].equals(s[right], true)){
                if(deletionCount < 1){
                    val skipL = s.substring(left+1, right+1)
                    val skipR = s.substring(left, right)
                    return isPlaindrome(skipL) || isPlaindrome(skipR)
                }else{
                    return false
                }
            }

            left++
            right--
        }
        return true


    }

    fun isPlaindrome(str : String): Boolean {
          var left = 0
            var right = str.length - 1
            while (left < right) {
                if (str[left] != str[right]) return false
                left++
                right--
            }
            return true
    }
}
