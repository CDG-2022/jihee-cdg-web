package com.cdg.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//@RestController
@Controller
// @RestController                  vs      @Controller
// 뷰 리턴 불가능                         Spring Web MVC
//                                      뷰 리턴 가능
// 기본적으로 @ResponseBody 의미론을 가정하는 컨트롤러(?)   모든 핸들러 메서드에 @ResponseBody 필요
class TestController {

    @GetMapping("/api/v1/cdg-names")
    public String gethome() {

        // 대충 디비랑 통신해서 로그인정보를 가져옴

        return "/test.html";
//        return "[ '전지희', '이상훈' ]";
    }

}