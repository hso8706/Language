# JVM? JRE? JDK?

## JVM

### 컴파일(compile)

: 프로그래밍 언어를 기계어로 바꿔주는 과정
: 자바에서는 `.java`파일을 `.class`파일로 바꿔주는 것을 의미함
: 자바에서 컴파일의 주체는 `javac`
: `.java`파일이란 프로그래머가 작성한 source code
: `.class`파일이란 JVM이 이해할 수 있는 언어로 변환된 코드. 이를 `Bytecode`라고 한다.

### JVM(Java Virtual Machine)

: 자바 프로그램을 실행시키는 도구이며, JVM 덕분에 Java는 OS(운영체제)에 독립적일 수 있음.
: JVM의 역할은 `Bytecode(.class)`를 읽고 해당 JVM이 설치된 OS에 맞게 번역(변환)하여 OS에 코드를 전달한다.
// OS(운영체제)는 프로그램이 실행시키기 위해 컴퓨터의 자원을 끌어다쓰는 역할을 한다. 그리고 OS별로 컴퓨터의 자원을 사용하는 것에는 각자의 규칙이 있기 때문에 JVM이 없다면 OS에 따라 프로그래밍 코드가 달라질 수 밖에 없다.

## JDK

### JRE(Java Runtime Environment)

: JVM + 표준 클래스 라이브러리

### JDK(Java Development Kit)

: JRE + 개발에 필요한 도구

### JDK의 버전 종류

- STS : Short Term Support
- MTS : Mid Term Support
- LTS : Long Term Support
  // 각 JDK 버전에 대한 관리 및 지원이 얼마나 오래 동안 제공되는지에 대한 키워드이다. 보통 기업들은 LTS 버전을 사용한다.
- JDK 8
  - 람다식 및 메서드 참조 도입
  - 컬렉션에 Stream API 사용 가능
  - 인터페이스 내부에 default 메서드 선언 가능
  - Optional 클래스 도입 등
- JDK 11
  - String 클래스에 strip, isBlack, lines 메서드 추가
  - Files 메서드에 readString 메서드 추가
  - 람다식의 인수 선언 시 var 키워드 사용 가능
  - 소스 파일을 javac을 통한 컴파일 없이 스크립트로 실행 가능
  - 차세대 가비지 콜렉터 도입 등
- JDK 17
  - 텍스트 블록 추가
  - 의사 난수 생성기 기능 향상
  - switch 문 기능 향상
  - 봉인 클래스 추가 등
