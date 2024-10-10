package com.khada.hund.main.controller;


import com.khada.hund.main.model.dto.UserDTO;
import com.khada.hund.main.model.service.MainService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Slf4j
public class MainController {

    private final MainService service;

    public MainController(MainService service) {
        this.service = service;
    }


    @GetMapping(value = {"/", "/main"})
    public ModelAndView mainLocation(ModelAndView mv){

        mv.setViewName("main/index");

        return mv;
    }

    @PostMapping(value = "/login")
    public String login(@ModelAttribute UserDTO user, Model model){

        log.info("user : " + user);

        String login = "";

        login = service.loginUser(user);

        if (login.equals("true")){
            login = "board/boardList";
        }else {
            return "redirect:/";
        }

        return login;
    }
}
