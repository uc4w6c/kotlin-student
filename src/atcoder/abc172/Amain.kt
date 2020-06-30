package atcoder.abc172

// A - Calc
import java.lang.Math.pow

fun main() {
    val a = readLine()!!.toInt()
    print((a + pow(a.toDouble(), 2.0) + pow(a.toDouble(), 3.0)).toInt())
}
