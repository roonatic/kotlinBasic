package chap02.section3

fun main() {
    val a: Int = 1
//    val b:Double = a // 자료형 불일치
//    val c: Int = 1.1 // 자료형 불일치

    val b: Double = a.toDouble() // int형 변수 a를 double형 b로 변환
    val result = 1L + 3 // long형 + int형 = result는 long형


    /*
    * toByte    toFloat
    * toLong    toDouble
    * toShort   toChar
    * toInt
    * */
}