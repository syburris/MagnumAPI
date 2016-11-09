package com.theironyard.services;

import com.theironyard.entities.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by stevenburris on 11/9/16.
 */
public interface UserRepository extends CrudRepository<User, Integer> {
    User findFirstByName(String name);

}
