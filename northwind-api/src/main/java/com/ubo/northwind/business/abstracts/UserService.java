package com.ubo.northwind.business.abstracts;

import com.ubo.northwind.core.entities.User;
import com.ubo.northwind.core.utilites.results.DataResult;
import com.ubo.northwind.core.utilites.results.Result;

public interface UserService
{
    Result add(User user);
    DataResult<User> findByEmail(String email);
}
