package com.example.domain.member;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@AllArgsConstructor @Builder
@NoArgsConstructor
@Entity
public class Member {
  @Id @GeneratedValue
  private Long id;
  private String name;
}
