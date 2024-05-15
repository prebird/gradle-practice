package com.example.web.controller;

import com.example.domain.BoardService;
import com.example.dto.CreateBoardRequest;
import com.example.web.dto.CreatedId;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class BoardController {
  private final BoardService boardService;

  @PostMapping("/boards")
  public ResponseEntity<CreatedId> createBoard(CreateBoardRequest request) {
    return ResponseEntity.ok(CreatedId.of(boardService.createBoard(request).getId()));
  }
}
