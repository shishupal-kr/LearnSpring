package com.shishupal.FirstProject.entity;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class entry {
    private long id;
    private String title;
    private String Content;

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getTitl(){
        return title;
    }
}
