# Boolean
### 정의
- 논리 자료형(True, False)
### Falsy
- False로 취급되는 값
    ```markdown
    `0`, `0.0`, `()`, `{}`, `[]`, `None`, `""(빈 문자열`
    ```
### 연산자
- 논리 연산자
  - 논리 자료형 비교에 사용되는 연산자
  - `and`, `or,` `not`
- 비교 연산자
  - 논리 연산자와 다름
  - 할당된 값의 비교에 사용되는 연산자
    - `==`, `!=`  
    : 값이 같은지 다른지 파악하는 연산자  
    : 할당된 값만을 확인
    - `is`  
    : 값과 주소값이 같은지 동시에 확인하는 연산자
### 연산자 활용
- 논리 연산자의 단축 평가
  - and  
    : 첫 항이 `False`면 전체 `False`
  - or  
    : 첫 항이 `True`면 전체 `True`
- 삼항 연산자
    ```
    (True일 때의 값) if (조건문) else (False일 때의 값)

    // for java
    (조건문) ? (True일 때의 값) : (False일 때의 값)
    ```
### Boolean 자료형의 활용
- 대부분이 조건문, 반복문에 사용
    - `if`의 조건식
    - `while`의 조건식
