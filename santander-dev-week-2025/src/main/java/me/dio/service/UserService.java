package me.dio.service;

import me.dio.domain.model.User;

public interface UserService {
    User findByid(Long id);
    User create(User userToCreate);


}
