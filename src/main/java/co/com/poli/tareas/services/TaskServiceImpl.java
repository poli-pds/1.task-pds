package co.com.poli.tareas.services;

import co.com.poli.tareas.mapper.TaskInDTOToTask;
import co.com.poli.tareas.persistence.entity.Task;
import co.com.poli.tareas.persistence.repository.TaskRepository;
import co.com.poli.tareas.services.dto.TaskInDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService{
    private final TaskRepository taskRepository;
    private final TaskInDTOToTask taskInDTOToTask;

    @Override
    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    @Override
    public Task create(TaskInDTO taskInDTO) {
        return taskRepository.save(taskInDTOToTask.mapper(taskInDTO));
    }
}
