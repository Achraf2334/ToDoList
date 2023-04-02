package fr.openclassrooms.ToDoList.service;

import fr.openclassrooms.ToDoList.model.ToDoListModel;
import fr.openclassrooms.ToDoList.repository.ToDoListRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class ToDoListService {

    @Autowired
    private static ToDoListRepository toDoListRepository;

    public Optional<ToDoListModel> getToDoList(final Integer id) {
        return toDoListRepository.findById(id);
    }

    public static Iterable<ToDoListModel> getToDoList() {
        return toDoListRepository.findAll();
    }

    public void deleteToDoList(final Integer id) {
        toDoListRepository.deleteById(id);
    }

    public ToDoListModel saveToDoList(ToDoListModel toDoListModel) {
        ToDoListModel savedToDoListModel = toDoListRepository.save(toDoListModel);
        return savedToDoListModel;
    }

}

