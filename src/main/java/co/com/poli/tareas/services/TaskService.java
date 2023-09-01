package co.com.poli.tareas.services;

import co.com.poli.tareas.persistence.entity.Task;
import co.com.poli.tareas.services.dto.TaskInDTO;

import java.util.List;

public interface TaskService {

    List<Task> findAll();
    Task create(TaskInDTO task);
}
