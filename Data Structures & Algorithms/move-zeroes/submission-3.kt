class Solution {
    fun moveZeroes(nums: IntArray) {

        var left = 0

        for(i in nums.indices){
            if(nums[i]!=  0){
                nums[left] = nums[i].also{ nums[i] = nums[left]}
                left++
            }
        }

    }
}
