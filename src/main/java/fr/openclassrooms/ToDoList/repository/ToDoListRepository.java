package fr.openclassrooms.ToDoList.repository;

import fr.openclassrooms.ToDoList.model.ToDoListModel;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

// @Repository est une annotation Spring pour indiquer que la classe est un bean,
// et que son rôle est de communiquer avec une source de données (en l'occurrence la base de données).
@Repository
public interface ToDoListRepository extends JpaRepository<ToDoListModel, Integer> {

}

