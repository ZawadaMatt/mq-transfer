package com.github.zawadamatt.mqtransfer.repository;

import com.github.zawadamatt.mqtransfer.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


}
