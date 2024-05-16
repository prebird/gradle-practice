package com.example.domain;

import static org.assertj.core.api.Assertions.*;

import com.example.domain.board.Board;
import com.example.domain.member.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Board 테스트")
class BoardTest {
  public static final Member writer = Member.builder()
      .name("작성자")
      .build();

  @Test
  void 게시판_제목_변경에_성공합니다() {
    // given
    Board board = BoardFixture.WELCOME.createBoard(writer);
    String updateTitle = "수정된 제목";
    // when
    board.changeTitle(updateTitle);
    // then
    assertThat(board.getTitle()).isEqualTo(updateTitle);
  }

  @Test
  void 게시판_제목이_10자_초과여서_제목_변경에_실패합니다() {
    // given
    Board board = BoardFixture.WELCOME.createBoard(writer);
    String updateTitle = "11111111111";
    // when then
    assertThatThrownBy(() -> {
      board.changeTitle(updateTitle);
    }).isInstanceOf(IllegalArgumentException.class);
  }

  @Test
  void 게시판_내용_변경에_성공합니다() {
    // given
    Board board = BoardFixture.WELCOME.createBoard(writer);
    String updateContent = "수정된 내용";
    // when
    board.changeContent(updateContent);
    // then
    assertThat(board.getContent()).isEqualTo(updateContent);
  }
}
