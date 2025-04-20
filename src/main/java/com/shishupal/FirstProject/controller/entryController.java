package com.shishupal.FirstProject.controller;

import com.shishupal.FirstProject.entity.entry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class entryController {

     private Map<Long, entry> listEntry = new HashMap<>();

     @GetMapping()
    public List<entry> getAll(){
         return new ArrayList<>(listEntry.values());
     }

     @PostMapping
    public void createEntry(@RequestBody entry myEntry){
        listEntry.put(myEntry.getId(), myEntry);
     }
}
