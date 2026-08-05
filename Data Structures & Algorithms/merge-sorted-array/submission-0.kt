class Solution {
    fun merge(nums1: IntArray, mIdx: Int, nums2: IntArray, nIdx: Int) {
        var m = mIdx
        var n = nIdx
        var last = m + n -1

            while(m > 0 && n > 0){
                if(nums1[m-1]>nums2[n-1]){
                    nums1[last] = nums1[m-1]
                    m--
                }else{
                    nums1[last] = nums2[n-1]
                    n--
                }
                last--
            }

            // while(m>0){
            //     nums1[last] = nums1[m-1]
            //         m--
            //         last--
            // }

            while(n>0){
                  nums1[last] = nums2[n-1]
                    n--
                    last--
            }
    }
}
