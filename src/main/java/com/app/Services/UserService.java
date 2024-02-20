package com.app.Services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Dao.UserDao;
import com.app.Entities.User;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<User> getAllUsers() {
        return userDao.findAll();
    }

    public User getUserById(Long userId) {
        return userDao.findById(userId).orElse(null);
    }

    public User createUser(User user) {
        return userDao.save(user);
    }

    public User updateUser(Long userId, User user) {
        if (userDao.existsById(userId)) {
            user.setId(userId);
            return userDao.save(user);
        } else {
            return null; // Handle not found scenario
        }
    }

    public void deleteUser(Long userId) {
        userDao.deleteById(userId);
    }

    // Additional custom method example
    public User getUserByEmail(String email) {
        return userDao.findByEmail(email);
    }
}

