class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
      
      /**
      BRUTE FORCE - TC O(n2)
      
        val n = nums.size
        val res = IntArray(n)

        for(i in 0 until n){
            var prod = 1
            for (j in 0 until n) {
                if(i== j)continue
                prod *= nums[j]
            
            }
            res[i] = prod
        }
        return res

        **/

        /**
            DIVISION Method
        

            val n = nums.size
            val res = IntArray(n)
            var prod = 1
            var zeroCount = 0

            for (i in 0 until n) {
                if(nums[i]!=0){
                    prod *= nums[i]
                } else{
                    zeroCount++
                }
            }

            if(zeroCount > 1)return res

            for (j in 0 until n) {
               res[j]=  if(zeroCount > 0){
                    if(nums[j]== 0){
                        prod
                    } else 0
                }else{
                    prod/nums[j]
                }
            }
            return res

            **/

            /**
                Prefix & Suffix
                TC = O(n)
                SC = O(n)
            **/

            val n = nums.size
            val res = IntArray(n)
            // val pref = IntArray(n)
            // val suff = IntArray(n)

            // pref[0] = 1
            // suff[n-1] = 1
           
            // for(i in 1 until n){
            //     pref[i] = nums[i-1] * pref[i - 1]
            // }
            // for(i in n-2 downTo 0){
            //     suff[i] = nums[i+1] * suff[i+1]
            // }
            // for(i in 0 until n){
            //     res[i] = pref[i] * suff[i]
            // }


            var prefix = 1
            var postfix = 1

            for(i in nums.indices){
                res[i] = prefix
                prefix *= nums[i]
            }

            for(i in n-1 downTo 0){
                res[i] *= postfix
                postfix *= nums[i]
            }

            return res

    }
}
