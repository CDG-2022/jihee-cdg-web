package com.cdg.web.controller.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class NoticeCreateRequest {
    private String title;
    private String contents;
    private String author;
}
