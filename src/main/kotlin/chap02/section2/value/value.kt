package chap02.section2.value

//변수 추론
//int형
val num05 = 127
val num06 = -32768
val num07 = 2147483647
val exp01 = 123
val exp03 = 0x0F //접두사 0x를 사용해 16진 표기가 사용된 int형으로 추론
val exp04 = 0b00001011 // 접두사 0b를 사용해 2진 표기가 사용된 int형으로 추론
val exp09 = 32767 // 명시적으로 자료형 지정안하면 short형 범위도 int형으로 추론

// long형
val num08 = 9223372036854775807
val exp02 = 123L // 접미사 L을 사용해 long으로 추측

//short형: 직접 자료형 명시해야
val exp10: Short = 32767

//Byte형: 직접 자료형 명시해야
val exp08: Byte = 127


