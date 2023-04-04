package com.example.demo.service;

import com.example.demo.dto.PageRequestDTO;
import com.example.demo.dto.PageResponseDTO;
import com.example.demo.dto.TodoDTO;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface TodoService {

    Long register(TodoDTO todoDTO);

    TodoDTO read(Long tno);

    PageResponseDTO<TodoDTO> list(PageRequestDTO pageRequestDTO);

    void remove(Long tno);

    void modify(TodoDTO todoDTO);
}
