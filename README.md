Effective-Java
=================
***
(21/05/24) Item 1. 생성자 대신 정적 팩토리 메서드를 고려하라.
------------------------------------
### (클래스는 클라이언트에 public 생성자 대신(혹은 생성자와 함께) 정적 팩터리 메서드를 제공할 수 있다.)

<br> </br>
## - 정적 팩터리 메서드의 장점 - 
### 1. 이름을 가질 수 있다.
#### -> 이름을 가질 수 있어서 반환될 객체의 특성을 쉽게 묘사 할 수 있다.
### 2. 호출 될 때마다 인스턴스를 새로 생성하지는 않아도 된다.
#### -> 같은 객체가 자주 요청되는 상황이라면 성능을  상당히 끌어 올려준다.(플라이 웨이트 패턴 / 싱글턴 패턴)
### 3. 반환 타입의 하위 타입 객체를 반환 할 수 있는  능력이 있다.
#### -> 정적 팩토리 메서드를 사용하는 클라이언트는 얻은 객체를 인터페이스 만으로(구현 클래스가 아닌) 다루게 된다.
### 4. 입력 매개 변수에 따라 매번 다른 클래스의 객체를 반환할 수 있다.
### 5. 정적 팩토리 메서드를 작성하는 시점에는 반환할 객체의 클래스가 존재하지 않아도 된다.
#### -> ex: 서비스 제공자 프레임워크 JDBC

## - 정적 팩터리 메서드의 단점 - 
### 1. 상속을 하려면 public이나 protected 생성자가 필요하니 정적  팩터리 메서드만 제공하면 하위 클래스를 만들 수 없다.
### 2. 정적 팩터리 메서드는 프로그래머가 찾기 어렵다 
### -> API 문서를 잘 써놓고 메서드 이름을 알려진 규약대로 짓는게 좋다.
<br></br>
### *chap02 코드 참조*
***
### * Reflection : 구체적인 클래스 타입을 알지 못해도 해당 클래스의 객체 생성, 메서드 , 타입, 변수에 접근할 수 있도록 도와줌.
#### -> when ? : 동적으로 클래스를 사용해야 할 때, 즉 작성 시점에는 어떤 클래스를 사용해야 할지 모르는  경우, 런타임 시점에서 클래스를 가져와서 실행해야 하는 경우에 사용된다.
#### -> how ? : 자바 클래스 파일은 프로그램 생성 시 힙영역에 저장되므로, 클래스 이름만 알고 있다면 언제든 클래스의 정보를 가져 올 수 있다.
***
### JDBC에서 DriverManager.getConnect()은 정적 팩토리 메서드이다. 새로운 DB에서 제공되는 Driver가 추가되고 새로운 커넥션을 반환 받을 수 있다.(장점 5번 관련.)



