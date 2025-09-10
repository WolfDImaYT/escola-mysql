package com.etec.escola.Controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.etec.escola.Models.Usuario;
import com.etec.escola.Service.UsuarioService;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins ="*") // permite acesso do brouser
public class AuthController {

    private final UsuarioService service;

    public AuthController(UsuarioService service) {
        this.service = service;
    }
    @PostMapping("/register")
    public Usuario register(@RequestBody Usuario usuario){
        return service.salvarNovoUsuario(usuario);
    }

    @PostMapping("/login")
    public String Login(Usuario usuario){
        Usuario user = service.fazerLogin(usuario.getUsername(),usuario.getUsername());
        if (user != null){
            return "Login realizado"+ user.getUsername();
        }
        return "User ou senha invalida";
    }

}
