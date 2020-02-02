package com.luv2code.photoappappusers.web.controller;

import com.luv2code.photoappappusers.dto.UserDto;
import com.luv2code.photoappappusers.service.UserService;
import com.luv2code.photoappappusers.web.model.CreateUserRequestModel;
import com.luv2code.photoappappusers.web.model.CreateUserResponseModel;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author Jack Tran
 */
@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UsersController {

    private final UserService userService;

    private Environment env;

    @GetMapping("/status/check")
    public String status() {
        return "Working on port " + env.getProperty("local.server.port") + ", with token= " + env.getProperty("token.secret");
    }

    @PostMapping(consumes = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE },
                produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<CreateUserResponseModel> createUser(@Valid @RequestBody CreateUserRequestModel userDetail) {

        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        UserDto userDto = modelMapper.map(userDetail, UserDto.class);
        UserDto createdUser = userService.createUser(userDto);

        CreateUserResponseModel returnedValue = modelMapper.map(createdUser, CreateUserResponseModel.class);

        return ResponseEntity.status(HttpStatus.CREATED).body(returnedValue);
    }
}
