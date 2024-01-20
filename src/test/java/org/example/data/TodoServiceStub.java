package org.example.data;

import java.util.Arrays;
import java.util.List;

import org.example.data.TodoService;

public class TodoServiceStub implements TodoService {
    public List<String> retrieveTodos(String user) {
        return Arrays.asList("Learn Spring MVC", "Learn Spring",
                "Learn to Dance");
    }

    public void deleteTodo(String todo) {

    }
}
