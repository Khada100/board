package com.khada.hund.main.controller;


import com.khada.hund.main.model.dto.UserDTO;
import com.khada.hund.main.model.service.MainService;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@Slf4j
public class MainController {

    private final MainService service;

    public MainController(MainService service) {
        this.service = service;
    }


    @GetMapping(value = {"/", "/main"})
    public ModelAndView mainLocation(ModelAndView mv, @ModelAttribute("fail") String fail, HttpSession session){

//        if (session.getAttribute("userId") != null ) {
//
//            mv.setViewName("redirect:/board/main");
//
//            return mv;
//        }

        if(fail != null && !fail.isEmpty()){
            mv.addObject("fail" , fail);
        }
        mv.setViewName("main/index");

        log.info("mv : " + mv);

        return mv;
    }

    @PostMapping(value = "/login")
    public String login(@ModelAttribute UserDTO user,  RedirectAttributes redirectAttributes, HttpSession session){

        String login = service.loginUser(user);

        if (login.equals("true")){
            session.setAttribute("userId", user.getId());
            session.setMaxInactiveInterval(30 * 60);
            return  "redirect:/board/main";
        }else {
            redirectAttributes.addFlashAttribute("fail", "로그인 실패");
            return "redirect:/";
        }
    }

    @PostMapping(value = "/logout")
    public String logout(HttpSession session){

        session.invalidate();

        return "redirect:/";
    }

    @GetMapping(value = "/signup")
    public ModelAndView signUp(ModelAndView mv){

        mv.setViewName("/main/signUp");
        return mv;
    }

    @PostMapping(value = "/signup")
    public String signUp(@ModelAttribute UserDTO user){

        log.info("user : " + user );

        service.insertUser(user);

        return "redirect:/";
    }
}
