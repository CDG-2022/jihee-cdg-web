package com.cdg.web.controller.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data // @ToString, @EqualsAndHashCode, @Getter-모든 필드, @Setter-final 이 아닌 모든 필드, and @RequiredArgsConstructor
@Getter
@AllArgsConstructor // 모든 필드 값을 파라미터로 받는 생성자 만들기
public class NoticeCreateRequest {
    private String title;
    private String contents;
    private String author;
}
