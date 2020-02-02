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
public class LoginRequestModel {
    private String email;
    private String password;
}
