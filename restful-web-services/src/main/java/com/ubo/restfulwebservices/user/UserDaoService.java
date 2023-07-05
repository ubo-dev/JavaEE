package com.ubo.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService
{
    // JPA/Hibernate > Database
    // UserDaoService > Static List

    private static List<User> users = new ArrayList<>();
    private static int userCount = 0;


    static {
        users.add(new User(++userCount,"Adam",LocalDate.now().minusYears(30)));
        users.add(new User(++userCount,"Eve",LocalDate.now().minusYears(25)));
        users.add(new User(++userCount,"Jim",LocalDate.now().minusYears(20)));
    }

    public List<User> findAllUser()
    {
        return users;
    }

    public User findUser(Integer id)
    {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().orElse(null);
    }

    public User save(User user)
    {
        user.setId(++userCount);
        users.add(user);
        return user;
    }



}
