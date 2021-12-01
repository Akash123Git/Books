package com.bookapi.books.DB;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.bookapi.books.Models.User;

@Repository
public interface UserRepo extends MongoRepository<User,String> {
    
}
