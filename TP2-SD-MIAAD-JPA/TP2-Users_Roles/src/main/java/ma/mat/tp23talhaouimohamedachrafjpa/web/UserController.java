package ma.mat.tp23talhaouimohamedachrafjpa.web;

import ma.mat.tp23talhaouimohamedachrafjpa.entities.User;
import ma.mat.tp23talhaouimohamedachrafjpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users/{userName}")
    public User user(@PathVariable String userName) {
        User user = userService.findUserByUserName(userName);
        return user;
    }

}
