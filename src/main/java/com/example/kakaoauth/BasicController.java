package com.example.kakaoauth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BasicController {

    private final Logger log = LoggerFactory.getLogger(BasicController.class);

    private KakaoAPI kakaoAPI;

    public BasicController(KakaoAPI kakaoAPI) {
        this.kakaoAPI = kakaoAPI;
    }

    @GetMapping(value = "/")
    public String index() {
        return "index";
    }

    @GetMapping(value = "/login")
    public String login(@RequestParam String code, Model model) {
        log.info("Authorization Code is {}", code);

        String accessToken = kakaoAPI.getAccessToken(code);
        KakaoUserInfo kakaoUserInfo = kakaoAPI.getUserInfo(accessToken);

        model.addAttribute("kakaoUserInfo", kakaoUserInfo);

        return "welcome";
    }
}
