package com.example;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;

/**
 * Created by Elimas on 2016-10-11.
 */
@RestController
public class RegisterRestController {

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.setValidator(new RegisterRequestValidator());
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public RegisterResponse register(@Valid @RequestBody RegisterRequest registerRequest) {
        return new RegisterResponse("success", registerRequest.getName(), registerRequest.getEmail(), new Date().toString());
    }
}
