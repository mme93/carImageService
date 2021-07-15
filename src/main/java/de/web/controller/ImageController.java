package de.web.controller;

import de.web.service.Base64ImageCoderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageController {

    final Base64ImageCoderService base64ImageCoderService;
    public ImageController(Base64ImageCoderService base64ImageCoderService) {
        this.base64ImageCoderService = base64ImageCoderService;
    }

    @RequestMapping(path = "/image",method = RequestMethod.POST)
    public void setImage(){

    }

}
