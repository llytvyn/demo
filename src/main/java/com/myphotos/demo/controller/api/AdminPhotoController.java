package com.myphotos.demo.controller.api;

import com.myphotos.demo.model.Photo;
import com.myphotos.demo.service.IPhotoService;
import com.myphotos.demo.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class AdminPhotoController {
@Autowired
@Qualifier("mainPhotoService") //per far scegliere il service corretto da utilizzare
private IPhotoService photoService;

    public AdminPhotoController () {
    }

    @RequestMapping("/admin/api/photos")
    public Iterable<Photo> getAll (){
        return photoService.getAll();
    }
    @RequestMapping("/admin/api/photos/{id}")
    public Photo getById(@PathVariable int id) {
        Optional<Photo> photo = photoService.getById(id);
        if (photo.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Item not found");
        }
        return photo.get();
    }

    //aggiungere una nuova foto
    @RequestMapping(value = "/admin/api/photos", method = RequestMethod.POST)
    public Photo create(@RequestBody Photo photo){
        return photoService.create(photo);
    }

    //modificare una foto esistente
    @RequestMapping(value = "/admin/api/photos/{id}", method = RequestMethod.PUT)
    public Photo update(@PathVariable int id, @RequestBody Photo photo) {

        Optional<Photo> updatedPhoto = photoService.update(id,photo);
        if (updatedPhoto.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Item not found");
        }
        return updatedPhoto.get();
    }

    //cancellare una foto esistente
    @RequestMapping(value = "/admin/api/photos/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable int id) { // il body non è necessario

        Boolean isDeleted = photoService.delete(id);
        if (isDeleted == false) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Item not found");
        }

    }
}
