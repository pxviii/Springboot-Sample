package com.pavi.sample.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
// modelentity from orm
import jakarta.persistence.Id;
@Entity
public class Resume {
    public Long getRid() {
        return rid;
    }
    public void setRid(Long rid) {
        this.rid = rid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    @Id
    // autoincrement
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rid;//primary key auto increment 
    private String name;
    private String email;
    private String address;
}
