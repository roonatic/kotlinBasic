package chap02.section3

fun main() {
    val num = 256

    // keyworkd: is
    if(num is Int) {
        print(num)
    } else if (num !is Int) {// num이 Int형이 아니라면
        print("Not a Int")
    }
}