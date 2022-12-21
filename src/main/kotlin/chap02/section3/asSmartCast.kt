package chap02.section3

fun main() {
    // as는 형 변환이 가능하지 않으면 예외 발생
//    val x: String = y as String // y가 null이 아니면 String으로 형 변환되어 x에 할당
    val y = 6
    val x: String? = y as? String  // String형
    println("x: $x")


}