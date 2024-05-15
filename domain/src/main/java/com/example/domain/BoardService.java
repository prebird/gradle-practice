package com.example.domain;

import com.example.dto.CreateBoardRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class BoardService {
  private final BoardRepository boardRepository;

  @Transactional
  public Board createBoard(CreateBoardRequest request) {
    return boardRepository.save(request.toEntity());
  }
}
