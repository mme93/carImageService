package de.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageController {

    @RequestMapping(path = "/image",method = RequestMethod.POST)
    public void setImage(){

    }

}
