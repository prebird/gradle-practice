package com.example.domain;

import com.example.domain.board.Board;
import com.example.domain.board.BoardType;
import com.example.domain.member.Member;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum BoardFixture {
  WELCOME("반갑습니다!", "방문해주셔서 감사합니다.", BoardType.GENERAL)   // '일반' 타입의 글
  , UPDATE_NOTICE("업데이트 공지", "업데이트 실시합니다.", BoardType.IMPORTANT);  // '중요' 타입의 글

  private final String title;
  private final String content;
  private final BoardType boardType;

  public Board createBoard(Member writer) {   // writer(작성자) 변경 가능
    return Board.builder()
        .title(title)
        .content(content)
        .boardType(boardType)
        .writer(writer)
        .build();
  }
}
