package chap02.section3

fun main() {
    var test: Number = 12.2 // 12.2에 의해 test는 스마트 캐스트
    println("$test") // 12.2

    test = 12 // Int형으로
    println("$test")

    test = 120L // long형으로 : 120
    println("$test")

    test += 12.0f // float형으로
    println("$test") // 132.0
}