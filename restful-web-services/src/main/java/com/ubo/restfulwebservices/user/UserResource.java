package com.ubo.restfulwebservices.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserResource
{
    private UserDaoService userDaoService;

    public UserResource(UserDaoService userDaoService)
    {
        this.userDaoService = userDaoService;
    }
    @GetMapping("/users")
    public List<User> getAllUser()
    {
       return userDaoService.findAllUser();
    }

    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable int id) {
        User user = userDaoService.findUser(id);
        if (user == null) throw new UserNotFoundException("id:" + id);

        return user;
    }

    @PostMapping("/users")
    public ResponseEntity<User> createUser(@RequestBody User user)
    {
        User savedUser = userDaoService.save(user);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }

}
