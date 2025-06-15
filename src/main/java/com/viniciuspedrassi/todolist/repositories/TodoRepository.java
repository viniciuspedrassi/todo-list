package com.viniciuspedrassi.todolist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viniciuspedrassi.todolist.entities.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
