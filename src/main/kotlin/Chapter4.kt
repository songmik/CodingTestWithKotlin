import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

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
fun main() {

}

// 2562. 최댓값

// 10810. 공 넣기

// 10813. 공 바꾸기

// 5597. 과제 안 내신 분..?

// 3052. 나머지

// 10811. 바구니 뒤집기

// 1546. 평균
