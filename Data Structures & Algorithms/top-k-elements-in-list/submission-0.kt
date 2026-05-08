class Solution {
 fun topKFrequent(nums: IntArray, k: Int): IntArray {
    //   val freq = MutableList(nums.size,{-1})

    //     for (num in nums) {
    //         println("num = $num")
    //         val filteredList = nums.filter {
    //              it == num 
    //         }
    //         println("filtered list size = ${filteredList.size}")
    //         println("freq = $freq before adding")
    //         freq[filteredList.size-1] = num
    //         println("freq = $freq after adding")
    //     }

    //         println("freq size--> ${freq.size}")
    //         println(    "freq --> $freq")
    //     val result = mutableListOf<Int>()

    //     for (i in freq.size-1 downTo 0) {
    //         if(freq[i]>=0){
    //             println("add ${freq[i]}")
    //             result.add(freq[i])
    //             println("result --> ${result}")
    //             if (result.size == k) {
    //                 return result.toIntArray()
    //             }
    //         }
    //     }
    //     return result.toIntArray()


    val count = HashMap<Int, Int>()
    for (num in nums){
        count[num] = (count[num] ?: 0) + 1
    }
    println("count map is $count")
    
    val buckets = Array<MutableList<Int>>(nums.size + 1) { mutableListOf() }
    for ((num, freq) in count) {
        println("num is $num")
        println("freq is $freq")
        buckets[freq].add(num)
    }

    val result = mutableListOf<Int>()
    for (i in buckets.size - 1 downTo 0) {
        for (num in buckets[i]) {
            result.add(num)
            if (result.size == k) return result.toIntArray()
        }
    }
    return result.toIntArray()
    }
}