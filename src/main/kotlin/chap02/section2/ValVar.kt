package chap02.section2

fun main() {
    val number = 10 // number변수는 int형으로 추론
    var language = "Korean" // language 변수는 String으로 추론
    val secondNumber: Int = 20 //secondNumber 변수는 자료형을 int형으로 명시적으로 지정
    language = "English"

    println("number: $number")
    println("language: $language")
    println("secondNumber: $secondNumber")
}