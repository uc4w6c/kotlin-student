package atcoder.abc172

// B - Minor Change
fun main() {
    val s = readLine()!!
    val t = readLine()!!

    var diffCount = 0
    for (i in 0..s.length - 1) {
        if (s[i] != t[i]) diffCount++
    }
    print(diffCount)
}

