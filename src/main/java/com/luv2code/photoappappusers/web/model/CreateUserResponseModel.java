package com.luv2code.photoappappusers.web.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Jack Tran
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserResponseModel {
    private String firstName;
    private String lastName;
    private String email;
    private String userId;
}
