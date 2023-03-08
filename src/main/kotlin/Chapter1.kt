// 1_1 : 일반적인 Hello World 프로그램
fun main1(args: Array<String>) {
    println("Hello World!")

    // Kotlin return 값이 없는 이유 : 리턴이 없는 함수를 만들었기 때문에
    // 'fun main() : Int { '에서 Int 값이 리턴
}

//1_2 : println() 함수가 여러 개인 프로그램
fun main2() {
    println("Hello World!")
    println("Merry Christmas")
    println("Happy New Year")

    println("Hello World!")
    println("Merry Christmas")
    println("Happy New Year")

    println("Hello World!")
    println("Merry Christmas")
    println("Happy New Year")
}

// 1_3 : 1_2를 for문을 사용한 프로그램
fun main3() {
    for (i in 0..2) {
        println("Hello World!")
        println("Merry Christmas")
        println("Happy New Year")
    }
}

// 1_4 : 무식한 검색 프로그램
fun main() {
    val input = 0

    // 배열의 크기만 지정하고 값은 나중에 저장할 경우 arrayOfNulls(size) 함수를 이용, 배열 선언과 동시에 값을 초기화 할 경우 arrayOf(value) 함수를 이용
    val data = arrayOfNulls<Int>(1000)

    for(i in 0..999) {
        data[i] = i+1
    }

    println("찾을 값을 입력하세요 => ")



}