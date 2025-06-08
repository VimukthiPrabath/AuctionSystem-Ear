package lk.javainstitute.ee.ejb;

import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateful;
import jakarta.enterprise.context.SessionScoped;

@Stateful
@SessionScoped
@LocalBean
public class SessionManager {
    private String currentUser;

    public void login(String username) {
        this.currentUser = username;
    }

    public String getCurrentUser() {
        return currentUser;
    }
}
