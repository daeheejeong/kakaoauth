package com.example.kakaoauth;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class KakaoUserInfo {
    String id;
    String nickname;
    String profileImage;
    String thumbnailImage;
    Boolean profileNeedsAgreement;
    Boolean hasEmail;
    Boolean emailNeedsAgreement;
    Boolean isEmailValid;
    Boolean isEmailVerified;
    String email;
    Boolean hasBirthday;
    Boolean birthdayNeedsAgreement;
    String birthday;
    Boolean hasGender;
    Boolean genderNeedsAgreement;
    String gender;
}
