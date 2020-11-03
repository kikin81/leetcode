fun main() {
    var inputArr = intArrayOf(12, 345, 2, 6, 7896)

    // expected 2
    print(findNumbers(inputArr))
}

fun findNumbers(nums: IntArray): Int {
    var numEvenDigits = 0
    for (num in nums) {
        if (num < 10) {
            continue
        }
        when (num) {
            in 10..99 -> numEvenDigits += 1
            in 1000..9999 -> numEvenDigits += 1
            in 100000..999999 -> numEvenDigits += 1
        }
    }

    return numEvenDigits
}
