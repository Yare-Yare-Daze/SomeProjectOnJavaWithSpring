package com.example.SomeNewProject.repos;


import com.example.SomeNewProject.domain.Message;
import org.springframework.data.repository.CrudRepository;;

public interface MessageRepo extends CrudRepository<Message, Long> {

}
