package com.cdg.web.controller;

import com.cdg.web.controller.request.NoticeCreateRequest;
import com.cdg.web.controller.request.NoticeGetRequest;
import com.cdg.web.controller.request.NoticeModifyRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController // @Controller 의 특수 버전, @Controller 및 @ResponseBody 포함(보통 둘이 같이 씀) -> 컨트롤러 구현을 단순화, @ResponseBody 불필요
//@Component 아래에 @Controller 아래에 @RestController
public class NoticeController {

    private List<Notice> list = List.of(
            new Notice(0, "제목1", "내용", "전지희", LocalDate.now(), LocalDate.now()),
            new Notice(1, "제목2", "내용", "전지희", LocalDate.now(), LocalDate.now()),
            new Notice(2, "제목3", "내용", "전지희", LocalDate.now(), LocalDate.now()),
            new Notice(3, "제목4", "내용", "전지희", LocalDate.now(), LocalDate.now()),
            new Notice(4, "제목5", "내용", "전지희", LocalDate.now(), LocalDate.now())
    );

    @GetMapping("/notices")
    public List<Notice> getList(NoticeGetRequest request) {
        return list;
    }

    @GetMapping("/notices/{id}")
    public Notice getList(@PathVariable int id) {
        return list.stream().findFirst().get();
    }

    @PostMapping("/notices")
    public ResponseEntity create(@RequestBody NoticeCreateRequest request) {
        // 대충 요청값이 유효한지 체크하는 로직
        // 대충 디비에 저장하는 로직
        return ResponseEntity.ok().build();
    }

    @PutMapping("/notices/{id}")
    public ResponseEntity modify(
            @PathVariable int id,
            @RequestBody NoticeModifyRequest request
    ) {
        // 대충 요청값이 유효한지 체크하는 로직
        // 대충 디비에서 꺼내오는 로직
        // 대충 꺼내온거 수정해서 업데이트 치는 로직
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/notices/{id}")
    public ResponseEntity remove(@PathVariable int id) {
        // 대충 요청값이 유효한지 체크하는 로직
        // 대충 디비에서 삭제하는 로직
        return ResponseEntity.ok().build();
    }

}
