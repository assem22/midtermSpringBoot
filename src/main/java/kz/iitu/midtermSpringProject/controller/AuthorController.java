package kz.iitu.midtermSpringProject.controller;

import kz.iitu.midtermSpringProject.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AuthorController {

    @Autowired
    private AuthorService authorService;
}
