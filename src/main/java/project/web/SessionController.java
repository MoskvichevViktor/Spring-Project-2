package project.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/sessions")
public class SessionController {

    @GetMapping
    public String checkSession(Model model, HttpSession httpSession){
        return "session";
    }

    @PostMapping
    public String saveSession(HttpServletRequest request){
        HttpSession session = request.getSession();
        return "session";
    }

}
