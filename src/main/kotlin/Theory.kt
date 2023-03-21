// 시간 복잡도(Time Complexity)

// 1. 상수 시간(Constant time)
fun checkFirst(names: List<String>) {
    if (names.firstOrNull() != null) {
        println(names.first())
    } else {
        println("no names")
    }
}

// 2. 선형 시간(Linear Time)
fun printNames(names: List<String>) {
    for (name in names) {
        println(name)
    }
}

// 3. 2차 시간(Quadratic Time)
fun multiplicationBoard(size: Int) {
    for (number in 1..size) {
        print("|")
        for (otherNumber in 1..size) {
            print("$number x $otherNumber = ${number*otherNumber} |")
        }
        println()
    }
}

// 4. 로그 시간(Logarithmic Time)
val numbers = listOf(1, 3, 56, 66, 68, 80, 99, 105, 450)

fun linearContains(value: Int, numbers: List<Int>): Boolean {
    for (element in numbers){
        if (element == value) {
            return true
        }
    }
    return false
}

// 5. 유사 선형 시간(Quasilinear Time)

