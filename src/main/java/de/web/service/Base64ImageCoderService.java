package de.web.service;

import de.script.ScriptStarter;
import org.springframework.stereotype.Service;

@Service
public class Base64ImageCoderService {

    private final ScriptStarter scriptStarter;

    public Base64ImageCoderService(ScriptStarter scriptStarter) {
        this.scriptStarter = scriptStarter;
    }
    public boolean getImgFromBase64(String base64){

        return true;
    }
    public String getBase64FromImg(String path){

        return "hllo";
    }
    public String getInfoFromImg(){

        return "Hallo world";
    }

}
