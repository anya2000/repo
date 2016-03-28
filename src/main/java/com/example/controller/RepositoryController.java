package com.example.controller;

import com.example.model.Lesson;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Anya.Grinberg on 3/23/2016.
 */
@RestController
public class RepositoryController {
    @RequestMapping("/lesson/{id}")
    public Lesson getLesson(@PathVariable("id") String id){
        return new Lesson(id, id, id);
    }

}
