package com.cdg.web.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate; // 날짜 정보만! 시간 정보만 필요할 땐 LocalTime! 날짜와 시간이 모두 필요할 땐 LocalDateTime

@Data // @ToString, @EqualsAndHashCode, @Getter: 모든 필드, @Setter: final 이 아닌 모든 필드, @RequiredArgsConstructor
@Getter
@AllArgsConstructor // 모든 필드 값을 파라미터로 받는 생성자 만들기
@NoArgsConstructor
@Entity
public class Notice {
    @Id
    @GeneratedValue
    @Column(name = "notice id")
    private Long id;
    private Long author;
    private String title;
    private String contents;
    private LocalDate registerDate;
    private LocalDate modifyDate;
}
