import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.collections.ArrayList

// 4. 1차원 배열

// 10807. 개수 세기
fun main_10807() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = br.readLine()!!.toInt()

    val st = StringTokenizer(br.readLine(), " ")
    val arr = IntArray(n)
    var total = 0

    for (i in 0 until n) {
        arr[i] = st.nextToken().toInt()
    }

    val v = br.readLine()!!.toInt()

    for(i in 0 until n) {
        if (arr[i] == v)  {
            total ++
        }
    }
    bw.write("$total\n")
    bw.close()
}

// 10871. X보다 작은 수
fun main_10871() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine(), " ")
    val sb = StringBuilder()
    val n = st.nextToken().toInt()
    val x = st.nextToken().toInt()
    val arr = IntArray(n)

    st = StringTokenizer(br.readLine(), " ")

    for(i in 0 until n) {
        arr[i] = st.nextToken().toInt()

        if (arr[i] <x) {
            sb.append(arr[i]).append(" ")
        }
    }
    println(sb)
}

// 10818. 최소, 최대
// TODO : 다시 풀기


// 2562. 최댓값
fun main_2562() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val arr = ArrayList<Int>()

    repeat(9) {
        arr.add(br.readLine().toInt())
    }

    println(arr.max())
    println(arr.indexOf(arr.max()) + 1)
}

// 10810. 공 넣기
fun main_10810() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine(), " ")
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()
    val arr = IntArray(n)

    for(a in 1..m) {
        st = StringTokenizer(br.readLine(), " ")
        val i = st.nextToken().toInt()
        val j = st.nextToken().toInt()
        val k = st.nextToken().toInt()

        for(b in i-1 until j) {
            arr[b] = k
        }
    }

    for(c in arr.indices) {
        println("${arr[c]}")
    }
}

fun main_10810_2() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n,m) = br.readLine().split(" ").map { it.toInt() }
    val arr = IntArray(n)

    for(a in 1..m) {
        val (i,j,k) = br.readLine().split(" ").map { it.toInt() }
        for(b in i-1 until j) {
            arr[b] = k
        }
    }

    for(c in arr.indices) {
        println("${arr[c]}")
    }
}

// 10813. 공 바꾸기

// 5597. 과제 안 내신 분..?

// 3052. 나머지

// 10811. 바구니 뒤집기

// 1546. 평균
