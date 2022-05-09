package testx.santander.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import testx.santander.app.domain.UserPasswordBlacklist;

/**
 * Spring Data JPA repository for the {@link UserPasswordBlacklist} entity.
 */
public interface UserPasswordBlacklistRepository extends JpaRepository<UserPasswordBlacklist, String> {}
