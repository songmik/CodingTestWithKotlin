import java.io.BufferedReader
import java.io.InputStreamReader

// 2739. 구구단
fun main_2739() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val N = br.readLine()!!.toInt()

    for (i in 1..9) {
        println("$N * $i = ${N*i}")
    }
}

// 10950. A+B-3
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val a = br.readLine()!!.toInt()

    for (i in 0 until a) {
        val (b,c) = br.readLine()!!.split(" ").map { it.toInt() }
        println(b+c)
    }
}

// 8393. 합

// 25304. 영수증

// 25314. 코딩은 체육과목 입니다

// 15552. 빠른 A+B

// 11021. A+B-7

// 11022. A+B-8

// 2438. 별찍기 -1

// 2439. 별찍기 -2

// 10952. A+B-5

// 10951. A+B-4
