package web.springApplication.services;

import web.springApplication.models.User;

import java.util.List;

public interface UserService {
    public List<User> findAll();
    public User findOne(long id);
    public void save(User user);
    public void update(User updatedUser, long id);
    public void delete(long id);
}
