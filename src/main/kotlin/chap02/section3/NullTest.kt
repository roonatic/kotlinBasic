package chap02.section3

fun main() {
    var str1 : String = "Hello Kotlin"
//    str1 = null // 코틀린은 변수에 null을 허용하지 않음
//    println("str1: $str1")

    var str2 : String? = "Hello Kotlin"
    str2 = null // 단, 뒤에 ? 붙이면 허용

//    println("str2: $str2 length: ${str2.length}") // 변수가 null일때는 legnth안됨
    println("str2: $str2 length: ${str2?.length}") // str2를 세이프 콜로 안전하게 호출

    // !!.(non-null 단정 기호)를 사용하면 변수에 할당된 값이 null이 아님을 단정해서 null 검사 없이 무시
 //   println("str2: $str2 length: ${str2!!.length}") //코딩상에서는 문제 없지만 compile시 발생
}