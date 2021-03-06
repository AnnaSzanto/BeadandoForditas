package hu.proba.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @ResponseBody
    @GetMapping (path="/1234")
    public String getMessage(@RequestParam(value = "name", defaultValue = "Felhasznalo")  String name){
        return String.format("Hello %s", name);
    }
}
