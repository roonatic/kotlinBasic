package chap02.section3

fun main() {

    val a: Int = 128
    val b = a
    println(a === b)

    val c: Int? = a // 128(가변변수)
    val d: Int? = a
    val e: Int? = c
    println(c == d) // true: 값은 같으므로
    println(c === d) // false: 다름
    println(c === e) // 값이랑 객체 같아서 true
}