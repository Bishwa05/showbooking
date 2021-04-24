package com.booking.ticket.data;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "BookingUser")
public class BookingUser
{
	@Id
    private long userId;
	@Column
    private String userName;
	@Column
    private Date dateOfBirth;
	@Column
    private long mobileNo;
	@Column
    private String emailId;
	@Column
    private String encryptedPassword;
	@Column
    private Role role;

}

enum Role{
    ADMIN,
    USER
}
