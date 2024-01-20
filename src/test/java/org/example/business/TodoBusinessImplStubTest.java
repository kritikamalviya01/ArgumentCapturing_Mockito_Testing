package org.example.business;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import org.example.data.TodoService;
import  org.example.data.TodoServiceStub;

public class TodoBusinessImplStubTest {

    @Test
    public void usingAStub() {
        TodoService todoService = new TodoServiceStub();
        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
        List<String> todos = todoBusinessImpl
                .retrieveTodosRelatedToSpring("Ranga");
        assertEquals(2, todos.size());
    }
}
