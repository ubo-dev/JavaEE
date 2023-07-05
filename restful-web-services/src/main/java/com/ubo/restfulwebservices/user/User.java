package com.ubo.restfulwebservices.user;

import java.time.LocalDate;

public class User
{
    private Integer id;
    private String name;
    private LocalDate birtDate;

    public User(Integer id, String name, LocalDate birtDate)
    {
        this.id = id;
        this.name = name;
        this.birtDate = birtDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirtDate() {
        return birtDate;
    }

    public void setBirtDate(LocalDate birtDate) {
        this.birtDate = birtDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birtDate=" + birtDate +
                '}';
    }
}
