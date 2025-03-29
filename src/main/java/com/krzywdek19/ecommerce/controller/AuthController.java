package com.krzywdek19.ecommerce.controller;

import com.krzywdek19.ecommerce.model.User;
import com.krzywdek19.ecommerce.repository.UserRepository;
import com.krzywdek19.ecommerce.request.SignUpRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {
    private final UserRepository userRepository;

    @PostMapping("/signup")
    public ResponseEntity<User> createUserHandler(@RequestBody SignUpRequest signUpRequest){
        var user = new User();
        user.setEmail(signUpRequest.getEmail());
        user.setFullName(signUpRequest.getFullName());

        var savedUser = userRepository.save(user);
        return ResponseEntity.ok(savedUser);
    }
}
