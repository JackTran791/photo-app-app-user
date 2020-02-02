package com.luv2code.photoappappusers.service;

import com.luv2code.photoappappusers.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * @author Jack Tran
 */
public interface UserService extends UserDetailsService {

    UserDto createUser(UserDto userDto);

    UserDto getUserDetailByEmail(String email);
}
