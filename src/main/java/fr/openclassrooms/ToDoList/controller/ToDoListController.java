package fr.openclassrooms.ToDoList.controller;


import fr.openclassrooms.ToDoList.model.ToDoListModel;
import fr.openclassrooms.ToDoList.service.ToDoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ToDoListController {
    @Autowired
    private ToDoListService toDoListService;


    @GetMapping("/ToDoList")
    public Iterable<ToDoListModel> getToDoList() {
        return ToDoListService.getToDoList();
    }

}