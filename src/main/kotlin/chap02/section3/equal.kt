package chap02.section3

fun main() {
    val a: Int = 128
    val b: Int = 128
    println(a == b) // true
    println(a === b) // true

    val c: Int? = 128
    println(a == c) // true
    println(a === c) //false
}