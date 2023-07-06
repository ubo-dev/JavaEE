package com.ubo.restfulwebservices.user;

import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class User
{
    private Integer id;
    @Size(min = 2, message = "Name should have at least 2 characters")
    private String name;

    @Size(message = "Birth date should be in the past.")
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
