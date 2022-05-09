package testx.santander.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import testx.santander.app.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
