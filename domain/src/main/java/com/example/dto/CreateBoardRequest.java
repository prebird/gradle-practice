package com.example.dto;

import com.example.domain.board.Board;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor @Builder
@Getter
public class CreateBoardRequest {
  private String title;
  private String content;

  public Board toEntity() {
    return Board.builder()
        .title(title)
        .content(content)
        .build();
  }
}
