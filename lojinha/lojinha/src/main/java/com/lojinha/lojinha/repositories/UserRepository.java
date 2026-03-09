package com.lojinha.lojinha.repositories;

import com.lojinha.lojinha.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
