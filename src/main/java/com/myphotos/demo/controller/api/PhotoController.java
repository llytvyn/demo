package com.myphotos.demo.controller.api;

import com.myphotos.demo.model.Photo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PhotoController {

    @RequestMapping("/api/photos")
    public Iterable<Photo> getAll (){
        List<Photo> list = new ArrayList<Photo>();
        list.add(new Photo(1,"./img/01.png"));
        list.add(new Photo(2,"./img/02.png"));
        list.add(new Photo(3,"./img/03.png"));
        return list;
        }
    }

