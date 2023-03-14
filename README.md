# 알고리즘 기반 합승 교통 서비스 TANNAE Application

# Project 개요

## Topic

‘TANNAE’ 프로젝트의 주요 아이디어는 기존의 택시 서비스에 합승 기능을 추가로 제공하는 것이다. 
여기서 합승은 한 번의 택시 운행에서 사전에 약속하지 않은 다른 승객과 함께 택시를 타는 행위이다. 
비슷한 경로의 탑승객들이 유동적으로 합승을 하고 합승한 인원끼리 비용을 나누어서 부담한다. 
이에 따라 기존의 택시 서비스보다 효율적인 금액으로 택시 서비스를 이용할 수 있다.

탑승자들에게 있지 않았던 합승의 선택권은 1982년에 법적으로 규제가 된다. 
40여 년이 지난 현재 택시 서비스는 온라인 플랫폼을 통해 제공되는 상황이다. 
온라인 플랫폼의 특성상 탑승자들이 합승에 대한 선택권을 보장받을 수 있다. 
이에 따라 규제샌드박스를 통해 합승 규제 완화를 테스트하게 되었고 큰 문제가 발생하지 않았다. 
IT 서비스의 시작이 법에 있다는 생각으로 ‘합승 교통 서비스 TANNAE 프로젝트’를 진행하게 되었다.

기존의 택시 서비스는 빠르고 편하다는 장점이 있지만, 비용적인 측면 때문에 꺼려지는 경향이 있다. 
완화된 합승 규제를 통해 비용적으로 효율적인 택시 서비스를 제공하고자 한다. 
또한 대중교통 서비스의 특징에 맞게 모바일 앱을 개발하는 것을 목적으로 한다.

## 유사 서비스 및 개선 사항

### Kakao Taxi

가장 대표적인 교통 서비스 제공 애플리케이션이다. 
일반적인 택시 서비스를 쉽게 이용할 수 있게 해주는 서비스이며 택시뿐만이 아니라 카카오 자전거, 대리운전, 퀵/택배, 렌터카 서비스도 제공한다. 
현재 가장 활성화된 이동 수단 관련 서비스 앱이다. 
손쉬운 방법으로 서비스를 제공하여 주지만 여전히 각 서비스의 비용은 반복적으로 사용하기에는 어려운 정도이다. 
이번 프로젝트에서 제공하는 서비스는 이러한 비용적 측면을 개선하여 줄 것으로 예상된다.

### 반반 택시

프로젝트 구상과 가장 유사한 서비스이다. 
같은 방향의 승객과 같이 타고 요금을 최대 50% 할인받는다. 
반반 호출 서비스뿐만이 아니라 일반 호출 서비스 또한 제공하여 일반 택시 사용자들한테도 유용한다.
선호 운행 설정으로 내비게이션 경로 운행, 안전 운행, 불필요한 대화 금지 등 탑승 전에 택시 기사에게 요청 사항을 전할 수 있으며 포인트 제도를 통해 경제적인 효율성도 갖추는 부분은 이번 프로젝트에서 참고할만한 부분이다.
하지만 반반 호출 서비스는 출발지와 도착지가 비슷한 사람끼리 요금을 반으로 나누어 내지만 ‘TANNAE’ 서비스는 출발지와 도착지가 상이하더라도 중간 경로가 비슷하면 중간에 동승을 하여 좀 더 유동적인 승하차가 가능하다.

### 우버

우버 택시는 기본적으로 탑승자와 기사의 구별이 없다는 것이 큰 특징이다. 
개인이 자신의 차량을 우버 택시로 등록할 수 있으며 택시 면허가 없이 자신이 기사가 되어 우버 서비스를 제공할 수 있다.
하지만 우버 택시는 성공하지 못하였다. 
이는 크게 택시 업체의 반발, 차별화 실패, 기존의 편한 운송 서비스 때문이다. 
이번 프로젝트로 제공되는 새로운 서비스는 기사와 탑승자를 구별하고 기존의 택시 기사들을 기사로 우선 선발할 것이다. 
또한 독자적인 배차 알고리즘 개발을 통해 기존 서비스를 개선하고 차별성을 둘 예정이다.

## Developing Tools

### Client

- Java
- Android Studio (Android API 31)

### Server

- AWS EC2 Ubuntu
- Spring Boot(Java - IntelliJ)
- RDBMS(MySQL)

### CASE

- draw.io
- StarUML

### Connection

- Socket.io
- Retrofit2
- Stomp

## Team 

### 최재원 - 팀장 및 백엔드 개발

- 서버 및 알고리즘 개발
- 데이터베이스 설계 및 구현
- 클라이언트-서버 통신 개발
- 안드로이드 보조 개발

### 김동현 - 안드로이드 UI 개발

- UI/UX 디자인 개발
- 지도 API 개발

### 이승찬 - 안드로이드 로직 개발

- 안드로이드 view & 이벤트 핸들러 개발
- 안드로이드 DB 개발

---

## Analysis 

* **Requirements Statement**
  - ***Functional Requirement***  
  ```
  Function for Account    : Sign In | Sign Out | Register | Withdrawal | Find Account | Edit Account
  
  Function for Driver     : Check service request | Change operation status
  
  Function for Passenger  : Request Service | Rate driver
  
  Function for User       : Lost & Found | QnA(FAQ) | Check History | Charge point
  ```
  - ***Non-Functional Requirement***
  ```
  Client/Server application   : Project is developed based on Client/Server.
  
  User Familiarity            : Develop Ui/UX intuitively for easy using.
  
  System Scalability          : Easy maintenance
  
  System Connectivity         : Server must track users position and update database in real time
  
  System Response Speed       : Response time must be faster than 1s for single request
  
  Security                    : Users private info must be secured
  ```
* **Use Case**  
  - ***Use Case Diagram***    
  <p align="center">
    <img src= "https://user-images.githubusercontent.com/87649850/172292202-1ee5b828-4e94-408d-af57-15467c80557c.png">
  </p>
  
  - ***Use Case Description***    
  <p align="center">
    <img src= "https://user-images.githubusercontent.com/87649850/172345551-b6b8a4e2-9673-4b3f-a238-0f6f96018275.gif">
  </p>

* **Diagram**  
  - ***Sequence Diagram***   
  <p align="center">
    <img src= "https://user-images.githubusercontent.com/87649850/172347060-dc84d195-fd34-4250-9a32-1995beba0bcc.gif">
  </p>
  
  - ***Screen FLow Diagram***   
  <p align="center">
    <img src= "https://user-images.githubusercontent.com/87649850/172292634-80fb4887-c3df-44ab-9e75-caf781c32c18.png">
  </p>

  - ***Class Diagram***   
  <p align="center">
    <img src= "https://user-images.githubusercontent.com/87649850/172292660-6c32670f-a6f7-4f39-aa6b-cd23fac7f2ab.png">
  </p>
  
## Design 
  
* **Diagram**     
  - ***Class Diagram***   
  <p align="center">
    <img src= "https://user-images.githubusercontent.com/87649850/172328033-63d1e21d-e920-4712-98c0-5cd3132071da.png">
  </p>
  
  - ***Sequence Diagram[Example(Payment & Assessment)]***   
  <p align="center">
    <img src= "https://user-images.githubusercontent.com/87649850/172348272-9fc28398-fbb6-4270-88b7-f5babfd05498.gif">
  </p>

* **User Interface**    
<p align="center">
  <img src= "https://user-images.githubusercontent.com/87649850/172342692-03dc58b5-c009-41bc-bcf3-4390f3b44449.gif">
</p>

* **Database Table**    
<p align="center">
  <img src= "https://user-images.githubusercontent.com/87649850/172344271-9d9ce7c1-8b66-44ad-9c33-97e04a48cf1d.gif">
</p> 

## Implementation   

* **Link**  

  Android Code Link   
  https://github.com/codesver/Capstone/tree/master/TANNAE

  Server Code Link  
  https://github.com/codesver/Capstone/tree/master/Server

* **Structure**   
<p align="center">
<img src="https://user-images.githubusercontent.com/87649850/172361065-ad2c5631-bbac-4379-9b80-c1868af0a9de.png">
</p>    

* **Implementation Size**     
<p align="center">
<img src="https://user-images.githubusercontent.com/87649850/172361142-fb9e5c29-227a-4617-bf72-dcf2d476c34d.png">
</p>    

* **Demo**  
https://user-images.githubusercontent.com/87649850/174003448-78cb473b-f622-4312-b6eb-e537aea6a30f.mp4   

* **Efficiency**
  - ***Test Method***
  ```
    Number of test case is 100 and the method of testing is as follows. There are three passengers who rides same taxi for service.
  Single test case ends when all three passengers get on and get off. The order in which service is requested remains the same,
  but all cases of boarding and getting off positions for each passenger are tested. In addition, since the final fee is settled in
  proportion to the distance, the test is conducted in consideration of the distance, and the service use area is limited to Gwangju.
  ```
  - ***Test Result***
  ```
    As a result of creating and testing of 100 test cases, the rate discount rate for the first service requester is 43%.
  The rate discount rate for the second service requester is 52%. The rate discount rate for the third service requester is 46%,
  and the average discount rate is 46%. This figure corresponds to 40-50% or more of the initially set rate discount rate,
  and it is judged that the algorithm has been implemented successfully.
  
    The reason why the discount rate for the second passenger is greater than that of the other two passengers is
  that the first passenger and the third passenger have an average number of solo rides at the beginning and end,
  while the second passenger does not have a relatively large number of solo rides in more tests. For this reason,
  Version 2.0 is expected to reduce the rate ratio of first and last passengers and to reduce the rate burden of first and last
  passengers by applying a method of calculating the rate that other users share.
  ```   
  ![image](https://user-images.githubusercontent.com/87649850/172363510-2a9480a6-b048-4b9b-8ae5-22a23794c7ab.png)   
