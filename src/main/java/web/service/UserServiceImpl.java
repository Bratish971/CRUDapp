package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.UserDao;
import web.model.User;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    @Transactional
    @Override
    public void createUser(User user) {
        userDao.createUser(user);
    }
    @Transactional
    @Override
    public List<User> readAllUsers() {
        return userDao.readAllUsers();
    }

    @Transactional
    @Override
    public User readUserById(long id) {
        return userDao.readUserById(id);
    }

    @Transactional
    @Override
    public void updateUser(long id, User user) {
        userDao.updateUser(id,user);
    }

    @Transactional
    @Override
    public void deleteUser(long id) {
        userDao.deleteUser(id);
    }
}
