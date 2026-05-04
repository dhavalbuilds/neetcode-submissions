class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()

        for ((idx, num) in nums.withIndex()){
            val remaining = target - num
            if(map.containsKey(remaining)){
               return intArrayOf(map.getValue(remaining),idx)
            } else{
               map[num] = idx
            }
        }
        return intArrayOf(0,1)
    }
}
