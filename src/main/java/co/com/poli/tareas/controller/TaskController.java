package co.com.poli.tareas.controller;

import co.com.poli.tareas.persistence.entity.Task;
import co.com.poli.tareas.services.TaskService;
import co.com.poli.tareas.services.dto.TaskInDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;

    @GetMapping
    public List<Task> findAll(){
        return taskService.findAll();
    }

    @PostMapping()
    public Task create(@RequestBody TaskInDTO task){
        return taskService.create(task);
    }

}
