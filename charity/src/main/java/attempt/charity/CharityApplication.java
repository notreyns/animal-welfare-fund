package attempt.charity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@SpringBootApplication
public class CharityApplication {
    @Autowired
    private UsersRepository repo;

    public static void main(String[] args) {
        SpringApplication.run(CharityApplication.class, args);
    }
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("users", repo.findAll());
        return "found";
    }
}
