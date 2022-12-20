package chap02.section2.value

//같은 패키지 안에 클래스가 달라도 변수명이 다르면 충돌이 남: 스코프 문제
//double형
val exp11 = 3.14

//float형
val exp12 = 3.14F //식별자 F로 float형 추론

//부동소수점 표기
val exp13 = 3.14E-2 // 왼쪽으로 소수점 2칸 이동: 0.0314
val exp14 = 3.14e2 //오른쪽으로 소수점 2칸 이동: 314