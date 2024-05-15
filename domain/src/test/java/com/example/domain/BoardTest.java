package com.example.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Board 테스트")
class BoardTest {
  @Test
  void 게시판_제목_변경에_성공합니다() {
    // given
    Board board = Board.builder()
        .title("테스트 제목")
        .content("테스트 내용")
        .build();
    String updateTitle = "수정된 제목";

    // when
    board.changeTitle(updateTitle);

    // then
    assertThat(board.getTitle()).isEqualTo(updateTitle);
  }

  @Test
  void 게시판_제목이_10자_초과여서_제목_변경에_실패합니다() {
    // given
    Board board = Board.builder()
        .title("테스트 제목")
        .content("테스트 내용")
        .build();
    String updateTitle = "11111111111";

    // when then
    assertThatThrownBy(() -> {
      board.changeTitle(updateTitle);
    }).isInstanceOf(IllegalArgumentException.class);
  }

  @Test
  void 게시판_내용_변경에_성공합니다() {
    // given
    Board board = Board.builder()
        .title("테스트 제목")
        .content("테스트 내용")
        .build();
    String updateContent = "수정된 내용";

    // when
    board.changeContent(updateContent);

    // then
    assertThat(board.getContent()).isEqualTo(updateContent);
  }
}
