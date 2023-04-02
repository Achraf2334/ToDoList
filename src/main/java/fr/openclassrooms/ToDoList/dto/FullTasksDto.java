package fr.openclassrooms.ToDoList.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class FullTasksDto {

    private int id;
    private String title;
    private String tag;
    private String priority;
    private int level;
    private LocalDate deadline;

}
