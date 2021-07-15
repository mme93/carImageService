package de.script;

import javax.script.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.StringWriter;

public class ScriptStarter {

    private final String path;

    public ScriptStarter(String path){
        this.path=path;
    }

    public boolean startPythonScript() throws FileNotFoundException, ScriptException {
        StringWriter writer = new StringWriter(); //ouput will be stored here

        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptContext context = new SimpleScriptContext();

        context.setWriter(writer); //configures output redirection
        ScriptEngine engine = manager.getEngineByName("python");
        engine.eval(new FileReader(path), context);
        System.out.println(writer.toString());
        return true;
    }

}
