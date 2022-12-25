package com.evgeny.MyBlog.models;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class User {

    @Id
    private Long id;

    private String email, password, username;

    @ManyToMany
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(
                    name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "id"))
    private Collection<Role> roles;
}
