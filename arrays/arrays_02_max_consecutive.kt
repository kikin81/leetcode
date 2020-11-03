fun main(args: Array<String>) {
    var inputArr = intArrayOf(1, 0, 1, 1, 0, 1)
    val result = findMaxConsecutiveOnes(inputArr)

    print(result)
}

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
