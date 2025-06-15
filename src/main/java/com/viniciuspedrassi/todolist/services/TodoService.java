package com.viniciuspedrassi.todolist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.viniciuspedrassi.todolist.entities.Todo;
import com.viniciuspedrassi.todolist.repositories.TodoRepository;

@Service
public class TodoService {
	
	@Autowired
	private TodoRepository todoRepository;

	public List<Todo> create(Todo todo){
		todoRepository.save(todo);
		return list();
	}
	
	public List<Todo> list(){
		Sort sort = Sort.by("prioridade").descending().and(Sort.by("nome").ascending());
		todoRepository.findAll(sort);
		return todoRepository.findAll(sort);
	}
	
	public List<Todo> update(Todo todo){
		todoRepository.save(todo);
		return list();
	}
	
	public List<Todo> delete(Long id){
		todoRepository.deleteById(id);
		return list();

	}
}
