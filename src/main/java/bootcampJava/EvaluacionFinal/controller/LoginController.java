package bootcampJava.EvaluacionFinal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }
    
    @PostMapping("/login")
    public String loginSubmit(@RequestParam String username, @RequestParam String password, Model model) {
        if ("user".equals(username) && "password".equals(password)) {
            model.addAttribute("username", username);
            return "redirect:/";
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "login";
        }
    }
    
    @GetMapping("/")
    public String home(Model model, @RequestParam(value = "username", required = false) String username) {
        model.addAttribute("username", username);
        return "home";
    }
}
