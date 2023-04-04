package com.example.demo.repository;

import com.example.demo.domain.Todo;
import com.example.demo.dto.PageRequestDTO;
import com.example.demo.dto.TodoDTO;
import com.example.demo.repository.search.TodoSearch;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long>, TodoSearch {
    Page<TodoDTO> list(PageRequestDTO pageRequestDTO);
}
