package am.itspace.taskmanagement.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

@RequestMapping(value = "/",method = RequestMethod.GET)
    public String mainPage(){
    System.out.println("Hello World !!!");
     return "index";
}

@GetMapping("/home/111/111/111")
    public String homePage(){
    return "home";
}
}
