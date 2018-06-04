package com.sn.edacy.appwebedacy.repositories;

import com.sn.edacy.appwebedacy.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long>{
}
