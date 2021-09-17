package com.example.demo.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Document(collection = "model")
public class Model {

     @Id
     private  String id;
     private String name;
     private int age;
     //private List<String> booksName;

}
