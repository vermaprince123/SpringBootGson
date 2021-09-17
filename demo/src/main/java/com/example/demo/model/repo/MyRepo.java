package com.example.demo.model.repo;

import com.example.demo.model.Model;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyRepo extends MongoRepository<Model, String> {
}
