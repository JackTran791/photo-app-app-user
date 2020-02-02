package com.luv2code.photoappappusers.repository;

import com.luv2code.photoappappusers.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Jack Tran
 */
public interface UserRepository  extends CrudRepository<UserEntity, Long> {

    UserEntity findByEmail(String email);
}
