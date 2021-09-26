package com.example.spring_boot_api_jwt_nhcl.entity;

import lombok.Getter;
import lombok.Setter;

import javax.management.relation.Role;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="users")
@Setter
@Getter
public class User extends BassEntity{
    private String username;

    private String password;


}
