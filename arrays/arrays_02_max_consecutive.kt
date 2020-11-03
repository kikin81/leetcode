/**
* Max consecutive ones problem from leetcode
* https://leetcode.com/explore/featured/card/fun-with-arrays/521/introduction/3238/
*/
fun main(args: Array<String>) {
    var inputArr = intArrayOf(1, 0, 1, 1, 0, 1)
    val result = findMaxConsecutiveOnes(inputArr)

    // expected 2
    print(result)
}

/**
* Find the maxinum number of consecutive ones
* in an array of 0 and 1s
*/
fun findMaxConsecutiveOnes(nums: IntArray): Int {
    var maxC = 0
    var currentC = 0
    for (num in nums) {
        if (num == 1) {
            currentC += 1
            if (currentC > maxC) {
                maxC = currentC
            }
        } else {
            currentC = 0
        }
    }

    return maxC
}
