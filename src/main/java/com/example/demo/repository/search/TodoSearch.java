package com.example.demo.repository.search;

import com.example.demo.dto.PageRequestDTO;
import com.example.demo.dto.TodoDTO;
import org.springframework.data.domain.Page;

public interface TodoSearch {
    Page<TodoDTO> list(PageRequestDTO pageRequestDTO);
}
