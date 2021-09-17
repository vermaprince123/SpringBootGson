package com.example.demo.controller;


import com.example.demo.model.Model;
import com.example.demo.model.repo.MyRepo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.aggregation.ArithmeticOperators;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Autowired
    MyRepo myRepo;
    
    
    @GetMapping("/")
    public Model viewAll() throws JsonParseException {

        String jsonString = "{'name':'prince','age':12}";
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        Model model = gson.fromJson(jsonString, Model.class);
        System.out.println(model);
        jsonString = gson.toJson(model);
        System.out.println(jsonString);
        myRepo.save(model);
        return model;

    }



}
