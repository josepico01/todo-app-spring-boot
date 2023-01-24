package com.myfirstapp.springboot3todoapp.repositories;

import com.myfirstapp.springboot3todoapp.models.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoItemRepository extends JpaRepository<TodoItem, Long> {

}
