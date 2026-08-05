class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        var res = mutableListOf<List<Int>>()
        nums.sort()

       
       for((i,a) in nums.withIndex()){
        if(i > 0 && a == nums[i-1]) continue

        var l = i+1
        var r = nums.size-1

        while(l<r){
            val threeSum = a + nums[l] + nums[r]

            if(threeSum > 0){
                r--
            }else if (threeSum < 0){
                l++
            }else{
                res.add(listOf(a, nums[l], nums[r]))
                l++
                r--
                while (l < r && nums[l] == nums[l - 1]) {
                            l++
                        }
            }
        }
       }
    return res
    }
}
