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
fun main_10950() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val a = br.readLine()!!.toInt()

    for (i in 0 until a) {
        val (b,c) = br.readLine()!!.split(" ").map { it.toInt() }
        println(b+c)
    }
}

// 8393. 합
fun main_8393() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine()!!.toInt()
    var result = 0

    for(i in 1..n) {
       result += i
    }
    println(result)
}

// 25304. 영수증
fun main_25304() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val X = br.readLine()!!.toInt()
    val N = br.readLine()!!.toInt()
    var total = 0

    for(i in 1..N) {
        val (a, b) = br.readLine().split(" ").map { it.toInt() }
        total += a*b
    }

    if (X == total) {
        println("Yes")
    } else {
        println("No")
    }
}

// 25314. 코딩은 체육과목 입니다
fun main_25314() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()
    val N = br.readLine()!!.toInt()

    for (i in 0 until N/4) {
        sb.append("long ")
    }
    sb.append("int")
    println(sb)
}

// 15552. 빠른 A+B

// 11021. A+B-7

// 11022. A+B-8

// 2438. 별찍기 -1

// 2439. 별찍기 -2

// 10952. A+B-5

// 10951. A+B-4
