import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.time.LocalTime
import java.util.StringTokenizer
import kotlin.math.max

// 1330. 두 수 비교하기
fun main_1330() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (a,b) = br.readLine()!!.split(" ").map { it.toInt() }

    if (a > b) {
        println(">")
    } else if (a <b) {
        println("<")
    } else {
        println("==")
    }
}

// 9498. 시험 성적
fun main_9498() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val a = br.readLine()!!.toInt()

    if (a in 90..100) {
        println("A")
    } else if (a in 80..89) {
        println("B")
    } else if (a in 70..79) {
        println("C")
    } else if (a in 60..69) {
        println("D")
    } else {
        println("F")
    }
}

// 2753. 윤년
fun main_2753() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val a = br.readLine()!!.toInt()

    if (a % 4 == 0 && (a % 100 != 0 || a % 400 == 0)) {
        println("1")
    } else {
        println("0")
    }
}

// 14681. 사분면 고르기
fun main_14681() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val x = br.readLine()!!.toInt()
    val y = br.readLine()!!.toInt()


    if (x>0 && y >0 ) {
        println("1")
    } else if (x<0 && y>0) {
        println("2")
    } else if (x<0 && y<0) {
        println("3")
    } else {
        println("4")
    }
}

// 2884. 알람 시계
fun main_2884() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (h,m) = br.readLine()!!.split(" ").map { it.toInt() }

    val time = LocalTime.of(h,m).minusMinutes(45)

    bw.write("${time.hour} ${time.minute}")
    bw.close()
}

// 2525. 오븐 시계 -> 방법1이 시간과 메모리를 덜 사용, 방법2는 코드 길이가 짧음
fun main_2525_1() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine(), " ")
    val a = st.nextToken().toInt()
    val b = st.nextToken().toInt()

    val c = br.readLine().toInt()

    // temp = a(시간*60) + b = 분 단위로 나타내기 위한 변수
    var temp= 60* a+b
    temp += c

    // 시간은 몫 ( 24를 % 해주는 이유는 만약에 24시간 이상이 될 경우를 고려하기 때문)
    val hour = (temp/60) %24

    // 분은 나머지를 뜻하므로
    val min = temp % 60

    println("$hour $min")
}

fun main_2525_2() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine())
    val time = LocalTime.of(st.nextToken().toInt(), st.nextToken().toInt()).plusMinutes(br.readLine().toLong())

    println("${time.hour} ${time.minute}")
}


// 2480. 주사위 세개
fun main_2480() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine())
    val a = st.nextToken().toInt()
    val b = st.nextToken().toInt()
    val c = st.nextToken().toInt()

    if (a==b && a==c){
        println(10000 +a*1000)
    } else if (a==b || a == c) {
        println(1000 + a*100)
    } else if (b == c) {
        println(1000 + b*100)
    } else {
        println(max(a,max(b,c))*100)
    }
}