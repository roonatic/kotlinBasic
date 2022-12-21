package chap02.section3

fun main() {
    checkArg("Hello") // x is String: Hello
    checkArg(5) // x is Int: 5
}

fun checkArg(x: Any) {
    if(x is String) {
        println("x is String: $x")
    }
    if(x !is String) {
        println("x is Int: $x")
    }
}