package attempt.charity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class MainController {
    @Autowired
    private UsersRepository usersRepository;

    @PostMapping("/donate/add")
    public @ResponseBody String addNewUser(@RequestBody Users user) {
        usersRepository.save(user);
        return "OK";
    }

    @GetMapping("/gratitude-list")
    public @ResponseBody Iterable<Users> getAllUsers() {
        return usersRepository.findAll();
    }
}
