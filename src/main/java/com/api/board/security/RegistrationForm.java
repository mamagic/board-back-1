//package com.api.board.security;
//
//import lombok.Data;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import tacos.User;
//
//@Data
//public class RegistrationForm {
//
//  public User toUser(PasswordEncoder passwordEncoder, User user) {
//    return new User(
//        user.getUsername(), passwordEncoder.encode(user.getPassword()),
//        user.getFullName(), user.getStreet(), user.getCity(), user.getState(), user.getZipCode(), user.getPhoneNumber());
//  }
//
//}
