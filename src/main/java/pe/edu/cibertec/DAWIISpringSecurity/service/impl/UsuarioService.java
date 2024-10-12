package pe.edu.cibertec.DAWIISpringSecurity.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DAWIISpringSecurity.model.Usuario;
import pe.edu.cibertec.DAWIISpringSecurity.repository.UsuarioRepository;
import pe.edu.cibertec.DAWIISpringSecurity.service.IUsuarioService;


@RequiredArgsConstructor
@Service
public class UsuarioService implements IUsuarioService {
    private final UsuarioRepository usuarioRepository;

    @Override
    public Usuario obtenerUsuarioXcodigo(String codigo) {
        return usuarioRepository.findByCodigo(codigo);
    }
}