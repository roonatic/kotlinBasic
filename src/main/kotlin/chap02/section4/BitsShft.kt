package chap02.section4

/*
* 4.shl(bits) 부호 있 bits만큼 왼쪽 이동
* 7.shr(bits)  부호 있 bits만큼 오른쪽 이동
* 12.ushr(bits) 부호 없이 bits만큼 오른쪽 이동
* 9.and(bits) 논리곱 연산
* 4.or(bits) 4 표현 bits 표현 논리합 연산
* 24.xor(bits) 24 표현하는 비트와 bits를 표현하는 비트의 배타적 연산
* 78.inv( ) 비트 모두 뒤집음
*
* */

fun main() {
    var x = 4
    var y = 0b0000_1010 // 10진수로 10
    var z = 0x0F // 10진수로 15

    println("x shl 2 -> ${x shl 2}")
    println("x .inv ( ) -> ${x.inv( )}")

    println("y shr 2 -> ${y/4} , ${y shr 2}")
    println("x shl 4 -> ${x*16}, ${x shl 4}")
    println("z shl 4 -> ${z*16}, ${z shl 4}")

    x = 64
    println("x shl 4 -> ${x/4}, ${x shr 2}")

}