package fr.openclassrooms.ToDoList.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Setter
@Getter
@Data
@Entity
@Table(name ="TodoLists")
public class ToDoListModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String title;
    private String tag;
    private String priority;
    private Integer level;
    private LocalDate deadline;


}
