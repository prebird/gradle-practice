package com.example.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor @Builder
@Entity
public class Board {
  @Id @GeneratedValue
  private Long id;
  private String title;
  private String content;

  public void changeTitle(String title) {
    if (title.length() > 10) {
      throw new IllegalArgumentException("제목은 10자를 초과할 수 없습니다.");
    }
    this.title = title;
  }

  public void changeContent(String content) {
    this.content = content;
  }
}
