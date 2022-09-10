package io.laaf.fastcampusprojectboard.repository;

import io.laaf.fastcampusprojectboard.domain.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAccountRepository extends JpaRepository<UserAccount, Long> {
}
