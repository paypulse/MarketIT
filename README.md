
※개발 요구 조건 
요건 1. API 응답 구현    
API
주문 접수처리
주문 완료처리
단일 주문조회
주문 목록조회

DB 구조
![Untitled (1)](https://github.com/paypulse/MarketIT/assets/31178314/98d94699-65ea-4710-bff1-0fb96ee63350)

//주문 테이블 
// 회원 주문 상태 : B0/C0/D0
//B0 :  주문 접수, C0: 주문 처리 , D0 : 주문 접수 완료
//배달 방식 BB1 : 픽업, BB2 : 배달 
Table order {
  orderId integer [primary key]
  storeCd varchar [note: '지점 번호']
  customerId varchar [note: '회원 번호']
  orderCd varchar [note: '주문번호'] 
  productCnt integer [note: '상품 수량']
  productPay integer [note: '결제 금액']
  deleveryAddress varchar [note: '배달 주소']
  orderYn char [note: '주문 상태']
  deleveryWay varchar [note: '배달 방식']
  orderDate timestamp [note: '주문 일시']
}

//지점테이블
Table store {
  storeId integer [primary key]
  storeCd varchar [note: '지점 번호']
  storeNm varchar [note: '지점명']
  productCd varchar [note: '상품번호']
  productNm varchar [note: '상품명']
  deleveryId integer [note: '배송 번호']
  orderPay varchar [note: '상품 가격']
  productYn varchar [note: '상품 유무']
}

//회원 테이블 
Table customer {
  customerId integer [primary key]
  customerNm varchar [note: '회원명']
  phoneNum varchar [note: '전화번호']
  cardNumber varchar [note: '카드번호']
  createDt timestamp [note: '회원생성일']
}


//배송 테이블
/// 베송 상태 :  MI/MC/ME/MD
//MI :  배송 준비 ,MC :  배송 시작,ME: 배송 중, MD: 배송완료
Table delevery {
  deleveryId integer [primary key]
  deleveryNm varchar [note: '배송 업체명']
  deleveryYn char [note: '배송상태']
  deleveryTip varchar [note: '배송팁 가격']
  deleveryDt timestamp [note: '배송 완료시간']
}


/// 한 사람이 오직 하나의 가게 에서만 주문 할 수 있다. 
//하나의 지점에서 여러개의 주문을 할 수 있다. 
//한 사람이 여러개의 배달 방식을 선정 할 수 있다. 

