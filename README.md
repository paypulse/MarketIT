
※개발 요구 조건   
요건 1. API 응답 구현      
[API]  
주문 접수처리  
주문 완료처리  
단일 주문조회  
주문 목록조회  

DB 구조
![Untitled (1)](https://github.com/paypulse/MarketIT/assets/31178314/98d94699-65ea-4710-bff1-0fb96ee63350)


회원 주문 상태 : B0/C0/D0  
B0 :  주문 접수, C0: 주문 처리 , D0 : 주문 접수 완료  
배달 방식 BB1 : 픽업, BB2 : 배달   
배송 상태 :  MI/MC/ME/MD  
MI :  배송 준비 ,MC :  배송 시작,ME: 배송 중, MD: 배송완료  
/// 한 사람이 오직 하나의 가게 에서만 주문 할 수 있다.   
//하나의 지점에서 여러개의 주문을 할 수 있다.   
//한 사람이 여러개의 배달 방식을 선정 할 수 있다.     

[테스트] 
http://localhost:8080/swagger-ui/index.html
