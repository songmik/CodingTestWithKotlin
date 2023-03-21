import java.util.Scanner
import java.io.*

// 백준 알고리즘

// 1000번. A+B
// 문제 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
fun main1000() = with(Scanner(System.`in`)) {
    println(nextInt() + nextInt())
}

// 1000번 BufferedReader 방법
//    import java.io.*
//
//    val br = BufferedReader(InputStreamReader(System.`in`))
//
//    fun main() {
//        val bw = BufferedWriter(OutputStreamWriter(System.out))
//        val (a,b) = br.readLine()!!.split(" ").map{it.toInt()}
//        val plus = a+b
//        bw.write("$plus")
//        bw.close()
//
//    }


// 1008번. A / B
fun main1008()  = with(Scanner(System.`in`)) {
    println(nextDouble() / nextDouble())
}

fun mainB_1008() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (a,b) = br.readLine()!!.split(" ").map{it.toDouble()}
    val div = a / b
    bw.write("$div")
    bw.close()
}
