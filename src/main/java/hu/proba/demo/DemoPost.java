package hu.proba.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoPost {

@PostMapping (path= "/4321")
    public Fordito postBody(@RequestBody(required=false) String text){
    Fordito fb = new Fordito("Alma a fa alatt");
    if (text!=null)
    { fb.setMessages(text); }
    fb.fordit();
    return fb;

    }
}
