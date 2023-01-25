package com.myphotos.demo.service;

import com.myphotos.demo.model.Photo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DbPhotoService {


    public Iterable<Photo> getAll () {
        return new ArrayList<Photo>();
    }

    public Optional<Photo> getById (int id) {
        return Optional.empty();
    }

    public Photo create(Photo photo){
        return null;
    }

    public Optional<Photo> update(int id, Photo photo) {

        return Optional.empty();
    }

    public Boolean delete(int id) {

        return false;
    }
}

