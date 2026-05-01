class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        
        // val map = mutableMapOf<Int, Int>()
        // nums.forEach{ i->
        // if(map.containsKey(i))
        //     return true
        // else
        //     map.put(i,1)
        // }
        // return false
        
        return nums.toSet().size < nums.size
    }
}
