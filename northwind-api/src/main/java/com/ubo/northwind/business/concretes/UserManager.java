package com.ubo.northwind.business.concretes;

import com.ubo.northwind.business.abstracts.UserService;
import com.ubo.northwind.core.dataAccess.UserDao;
import com.ubo.northwind.core.entities.User;
import com.ubo.northwind.core.utilites.results.DataResult;
import com.ubo.northwind.core.utilites.results.Result;
import com.ubo.northwind.core.utilites.results.SuccessDataResult;
import com.ubo.northwind.core.utilites.results.SuccessResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManager implements UserService
{
    private UserDao userDao;

    @Autowired
    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public Result add(User user) {
        this.userDao.save(user);
        return new SuccessResult("User has been added.");
    }

    @Override
    public DataResult<User> findByEmail(String email) {
        return new SuccessDataResult<User>(this.userDao.findByEmail(email),"User has been found.");
    }
}
