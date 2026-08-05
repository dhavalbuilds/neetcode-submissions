class Solution {
    fun sortedSquares(nums: IntArray): IntArray {
        var l = 0
        var r = nums.size - 1
        val res = mutableListOf<Int>()

        while (l <= r) {
            if (nums[l] * nums[l] > nums[r] * nums[r]) {
                res.add(nums[l] * nums[l])
                l++
            } else {
                res.add(nums[r] * nums[r])
                r--
            }
        }

        res.reverse()
        return res.toIntArray()
    }
}
