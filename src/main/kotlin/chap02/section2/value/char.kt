package chap02.section2.value

val ch = 'c'
val ch2: Char = 'K'

val ch1 = 'A'
fun main() {
    println(ch+1) // B

    // val chNum: Char = 65 //숫자를 사용하는 것은 오류를 발생시킴

    val code: Int = 65
    val chFromCode: Char = code.toChar()
    println(chFromCode)
}