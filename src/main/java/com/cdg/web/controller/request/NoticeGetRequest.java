package com.cdg.web.controller.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class NoticeGetRequest {
    private int page;
    private int size;
    private String title;
}
