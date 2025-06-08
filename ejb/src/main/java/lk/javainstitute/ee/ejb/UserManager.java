package lk.javainstitute.ee.ejb;


import jakarta.ejb.LocalBean;
import jakarta.ejb.Singleton;
import lk.javainstitute.ee.core.model.User;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Singleton
@LocalBean
public class UserManager {
    private Map<String, User> users = new ConcurrentHashMap<>();
    public boolean register(String username, String password) {
        if (users.containsKey(username)) return false;
        users.put(username, new User(username, password));
        return true;
    }
    public boolean authenticate(String username, String password) {
        User user = users.get(username);
        return user != null && user.getPassword().equals(password);
    }
}
