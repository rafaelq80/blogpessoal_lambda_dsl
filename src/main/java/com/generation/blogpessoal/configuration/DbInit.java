package com.generation.blogpessoal.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import com.generation.blogpessoal.model.Usuario;
import com.generation.blogpessoal.service.UsuarioService;

@Service
public class DbInit implements CommandLineRunner{

    @Autowired
    private UsuarioService usuarioService;

    @Override
    public void run(String... args) throws Exception {
        
        Usuario usuario = new Usuario(0L, "root", "root@root.com", "rootroot", " ");
        usuarioService.cadastrarUsuario(usuario);
        
    }
    
}
