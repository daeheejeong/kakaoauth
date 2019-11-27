# 카카오 소셜로그인 샘플 프로젝트 구성

프로젝트 내 소셜로그인(카카오) 기능 도입 전 로컬 프로젝트를 작성하고 구동을 확인해보았습니다.

### 구성
```
 
kakaoauth
    ㄴ BasicController.java
    ㄴ KakaoAPI.java
    ㄴ KakaoUserInfo.java
    ㄴ KakaoauthApplication.java
    
```

- `BasicController`: 인덱스 페이지와, 웰컴 페이지(로그인 후) 로의 라우팅을 수행합니다
- `KakaoAPI`: 카카오의 로그인 api를 실제로 요청하고 응답받는 서비스를 합니다. **RestTemaplte**을 사용하여 구현했습니다
- `KakaoUserInfo`: 결과로 받은 JSON을 맵핑하기 위한 Object Class 입니다. 

### 인증 단계

1. 클라이언트는 카카오 로그인 팝업을 통해 유저가 로그인을 한다.
2. 카카오 로그인에 성공 시, (우리 서버는) 지정했던 **CALLBACK URL**로 **사용자토큰**(ACCESS_TOKEN 및 REFRESH_TOKEN을 포함)을 발급받는다.
3. 클라이언트는 ACCESS_TOKEN 을 헤더에 포함해 사용자 정보등을 요청하고, 서버는 카카오 api를 호출 및 응답을 한다.