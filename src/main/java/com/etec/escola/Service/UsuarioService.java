package com.etec.escola.Service;

import com.etec.escola.Models.Usuario;
import org.springframework.stereotype.Service;
import com.etec.escola.Interface.AuthUsuarioRepository;

@Service

public class UsuarioService {
    private final AuthUsuarioRepository userioRepository;

    public UsuarioService(AuthUsuarioRepository usuarioRepository) {
        this.userioRepository = usuarioRepository;
    }

    public Usuario fazerLogin(String username, String senha){
        return userioRepository.findByUserAndSenha(username,senha).orElse(null);
    }

    public Usuario salvarNovoUsuario(Usuario user){
        return userioRepository.save(user);
    }


}
