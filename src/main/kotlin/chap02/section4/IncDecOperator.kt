package chap02.section4

fun main() {
    var num1 = 10
    var num2 = 10
    var result1 = ++num1 // 11
    var result2 = num2++ // 현재는 10

    println("result1: $result1")
    println("result2: $result2") //여기서 10
    println("num1: $num1")
    println("num2: $num2") //11
}