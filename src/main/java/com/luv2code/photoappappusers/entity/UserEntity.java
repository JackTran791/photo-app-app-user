package com.luv2code.photoappappusers.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Jack Tran
 */
@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity  implements Serializable {

    private static final long serialVersionUID = 3739392638621691235L;

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable=false, length=50)
    private String firstName;

    @Column(nullable=false, length=50)
    private String lastName;

    @Column(nullable=false, length=120, unique=true)
    private String email;

    @Column(nullable=false, unique=true)
    private String userId;

    @Column(nullable=false, unique=true)
    private String encryptedPassword;
}
