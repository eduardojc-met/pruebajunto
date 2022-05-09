package testx.santander.app.service.mapper;

import java.time.Instant;
import org.springframework.stereotype.Service;
import testx.santander.app.domain.User;
import testx.santander.app.domain.UserPasswordHistory;

@Service
public class UserPasswordHistoryMapper {

    public UserPasswordHistory userToUserPasswordHistory(User user) {
        UserPasswordHistory userPasswordHistory = new UserPasswordHistory();
        userPasswordHistory.setUserId(user.getId());
        userPasswordHistory.setResetDate(Instant.now());
        userPasswordHistory.setPassword(user.getPassword());
        userPasswordHistory.setUser(user);
        return userPasswordHistory;
    }
}
