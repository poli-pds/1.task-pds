package co.com.poli.tareas.services;

import co.com.poli.tareas.persistence.entity.Task;

import java.util.List;

public interface TaskService {

    List<Task> findAll();
    Task create(Task task);
}
