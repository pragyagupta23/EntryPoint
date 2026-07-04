package com.pragyagupta.entrypoint.repository;

import com.pragyagupta.entrypoint.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, ObjectId>, UserRepositoryCustom {
    User findByUserName(String username);

    void deleteByUserName(String username);
}
